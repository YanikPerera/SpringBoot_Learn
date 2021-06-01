package com.BistecGlobal;

import java.util.List;

//*******************REST SERVICES**************************

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

@PutMapping("/update")
public String updateUser(@RequestBody UserDTO newUserData) {
	
	return serviceuser.UpdateUser(newUserData);
}

/*@GetMapping("/find/{id}")
public UserDTO getUserById(@PathVariable Integer id) {
	
	return serviceuser.findById(id);
	
}*/

}
