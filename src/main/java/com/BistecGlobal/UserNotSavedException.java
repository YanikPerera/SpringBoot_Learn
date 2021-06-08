package com.BistecGlobal;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class UserNotSavedException extends RuntimeException{
	
	public UserNotSavedException(String err) {
		
		super(err);
		
	}
	

}
