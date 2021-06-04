package com.BistecGlobal;

//**********************This is how API end point call Using Rest controllers*************************8

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//using below tag spring boot identify this is a rest API acceptable method 
@RestController

// here if we define above on the class RequestMapping("/api") the browser should know if we call http://localhost:8080/api/ the class should be call
//@RequestMapping("/api")
public class first {

	
// using this @GetMapping("/") notation we can identify when call localhost:8080 should call this method 
	@GetMapping("/")
public String main() {
		
		return "Welcome to the secure page";
		
	}

	
// when call @GetMapping when we call  http://localhost:8080/api/hello should return this function output
	@GetMapping("/hello")
	public String hello() {
		
		return "Hello Restcontroller";
		
	}

}
