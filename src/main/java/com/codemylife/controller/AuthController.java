package com.codemylife.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.codemylife.entity.UserCredential;
import com.codemylife.service.AuthService;

@RestController
@RequestMapping("/auth")
public class AuthController {
@Autowired
private  AuthService service;
@PostMapping("/register")
public String addNewUser(@RequestBody UserCredential user)
{
	return service.saveUser(user);
}
@GetMapping("token")
public String getToken(UserCredential userCredential)
{
	return service.genetateToken(userCredential.getName());
}
@GetMapping("/validate")
public String validateToken(@RequestParam("token")String token)
{
service.validateToken(token);	
return "Token is valied";
}
}
