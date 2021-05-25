package com.BistecGlobal;

//*******************REST SERVICES**************************

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class ControllerUser {

// dependency injection 
// from @Autowired notation we can mention this as a injection to interface functions
	@Autowired
	private ServicesUser serviceuser;
	
@GetMapping("/all")	
	public String alluser() {

//once we auto-wired we can use this injection to add interface functions 
		return serviceuser.UserInterface();
// here also we can add data base code to the get all users data
//		return "All users";
		
	}

}
