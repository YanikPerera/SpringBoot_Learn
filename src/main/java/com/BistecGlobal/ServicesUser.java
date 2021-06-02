package com.BistecGlobal;

//import antlr.collections.List;
import java.util.List;

public interface ServicesUser {
	
/* in the interface we can create as a method,, just only call the function,, the implementation 
 * should be in another class*/
	List<UserDTO> UserInterface();
//this is the save users function on the interface	
	String saveUser(UserDTO Userdata);

//this is the update users function on the interface	
	String UpdateUser(UserDTO newUserData);
	
//this is the search user by ID function on the interface	
	//UserDTO findById(Integer id);



}
