package com.BistecGlobal;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//here i have passed to the end user as INTERNAL_SERVER_ERROR as 500 error
//once call to the java class from controller exception the end user can be notify 
//like there is an internal problem to save data from using 500 error msg
@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class UserNotSavedException extends RuntimeException{
	
	public UserNotSavedException(String err) {
		
		super(err);
		
	}
	

}
