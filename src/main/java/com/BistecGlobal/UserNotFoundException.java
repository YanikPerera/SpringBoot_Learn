package com.BistecGlobal;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException {
	
	public UserNotFoundException(String errorMsg) {
		
		super(errorMsg);
		// TODO Auto-generated constructor stub
	}

}