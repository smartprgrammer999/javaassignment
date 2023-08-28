package com.maven.tech.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrintHelloApi {
	@RequestMapping("/nikesh")
public String soMyName()
{
	return "MY SELF NIKESH SINGH";
}

}
