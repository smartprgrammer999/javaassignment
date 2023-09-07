 package com.websecurity.LearnWebSecurity1.config;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AnyRequestMatcher;
import org.springframework.stereotype.Service;

@Configuration
public class SecurityConfig {
//	@Bean
//	public PasswordEncoder passwordEncoder()
//	{
//		return new BCryptPasswordEncoder();
//	}
//	@Bean
//	 public UserDetailsService userDetailsService() {
//	UserDetails normalUser=User.withUsername("nikesh")
//			.password(passwordEncoder().encode("123456"))
//			.roles("NORMAL").build();
//	return new InMemoryUserDetailsManager(normalUser);	
//	}
//	 
//	@Bean
//	public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception
//	{
//	httpSecurity.csrf().disable().
//	authorizeHttpRequests().requestMatchers("/public")
//	.permitAll().anyRequest().authenticated().and().formLogin();
//	return httpSecurity.build();
//	}
	@Bean
	UserDetailsService users() {
	UserDetails user = User.withDefaultPasswordEncoder()
	        .username("user1")
	        .password("password")
	        .roles("USER")
	        .build();
	   return new InMemoryUserDetailsManager(user);
	 }  
	@Autowired
	   public void myCoolMethodName(AuthenticationManagerBuilder auth) throws Exception {
	    auth.authenticationProvider(authenticationProvider);
	   }
}
