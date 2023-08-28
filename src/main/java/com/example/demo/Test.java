package com.example.demo;

import java.lang.module.Configuration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
	@RequestMapping("/home")
//	@RequestMapping("/test")
	public List<configuration> getlist() {
		return Arrays.asList(
				new configuration(1023,"nikesh","c++"),
				new configuration(123,"amit","python"));

	}
	
	

}
