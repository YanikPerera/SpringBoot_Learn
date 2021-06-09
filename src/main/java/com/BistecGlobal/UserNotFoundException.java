package com.BistecGlobal;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


//here i have passed to the end user as NOT_FOUND as 404 error
//once call to the java class from controller exception the end user can be notify 
//like there is an not found exception, the end user can be notify the entered id or user name like find 
//any value does not exist from the data base 
@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException {
	
	public UserNotFoundException(String errorMsg) {
		
		super(errorMsg);
		// TODO Auto-generated constructor stub
	}

}
