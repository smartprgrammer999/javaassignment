 package com.websecurity.LearnWebSecurity1.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/hello")
public class Controller {
  @GetMapping("/normal")
	public ResponseEntity<String> normalUser()
	{
		return ResponseEntity.ok("Hello i am normal user");
	}
  @GetMapping("/admin")
	public ResponseEntity<String> adminUser()
	{
		return ResponseEntity.ok("Hello i am admin user");
	}
  @GetMapping("/public")
	public ResponseEntity<String> publicUser()
	{
		return ResponseEntity.ok("Hello i am public user");
	}

}
