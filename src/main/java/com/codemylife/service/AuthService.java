package com.codemylife.service;

 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.codemylife.entity.UserCredential;
import com.codemylife.repository.UserCredentialRepository;

@Service
public class AuthService {
	@Autowired
	private UserCredentialRepository repository;
    
	@Autowired
	private PasswordEncoder passwordEncoder ;
    @Autowired
	private JwtService jwtservice;
    @Autowired
    private UserCredential credential;
	 
	public String genetateToken(String username)
	{
		return jwtservice.generateToken(username);
	}
	 
	public String saveUser(UserCredential user) {
		credential.setPassword(passwordEncoder.encode(credential.getPassword()));
		repository.save(credential);
		return "user added to the database";
	}
	public void validateToken(String token) {
		jwtservice.validateToken(token);
		
	}
}
