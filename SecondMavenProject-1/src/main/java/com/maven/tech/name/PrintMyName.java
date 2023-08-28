package com.maven.tech.name;

//import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@ComponentScan
public class PrintMyName {
	@RequestMapping("/name")
	public String printMyName()
	{
		return "My name is nikesh";
	}

}
