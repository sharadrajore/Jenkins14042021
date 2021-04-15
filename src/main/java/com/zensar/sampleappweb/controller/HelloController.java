package com.zensar.sampleappweb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController  {
	
	@RequestMapping("/hello")
	public String sayHello() {
		return "<h1>Welcome to Jenkins </h1>";
	}
	
	@RequestMapping("/hi")
	public String sayHi() {
		return "<h1>Welcome to Jenkins and saying Hi </h1>";
	}
	
	@RequestMapping("/bye")
	public String sayBye() {
		return "<h1>Good Bye</h1>";
	}
	
	@RequestMapping("/greet")
	public String greet() {
		return "<h1>Good Morning !!!</h1>";
	}

}
