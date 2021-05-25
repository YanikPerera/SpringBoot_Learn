package com.BistecGlobal;

import org.springframework.stereotype.Service;


// here we should have to define this is a service 
@Service
public class ImplementationUserService implements ServicesUser {

	@Override
	public String UserInterface() {
		
		// here we can add data base connection to show as output all users 
		
		return "ALL USERS HERE";
		
	}

}

