package com.BistecGlobal;

import java.util.List;

//*******************REST SERVICES**************************

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@ControllerAdvice
public class ControllerUser extends RuntimeException{

// dependency injection 
// from @Autowired notation we can mention this as a injection to interface functions
	@Autowired
	private ServicesUser serviceuser;
	
@GetMapping("/all")	
	public List<UserDTO> alluser() {
	
//once we auto-wired we can use this injection to add interface functions 
	return serviceuser.UserInterface();
// here also we can add data base code to the get all users data
//		return "All users";
		
	}

//here i have change this @RequestBody UserDTO User-data
@PostMapping("/add")
public String addUser(@RequestBody UserDTO Userdata) {
	
	return serviceuser.saveUser(Userdata);	
	
}
//here is the update quarry 
//@RequestBody UserDTO newUserData we can get the data from UserDTO file 
//The newUserData param pass should to implementation class as parameter 

@PutMapping("/update")
public String updateUser(@RequestBody UserDTO newUserData) {
	return serviceuser.UpdateUser(newUserData);
}

//this is update quarry
//@GetMapping("/find/{id}") this @getMapping we can identify the end of the URL should 
//be find and here can be able pass id though the link
//@PathVariable Integer id can be identify the variable data which is pass from the id

/*@GetMapping("/find/{id}")
public UserDTO getUserById(@PathVariable Integer id) {
	
	return serviceuser.findById(id);
	
}*/

}
