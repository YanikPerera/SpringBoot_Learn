package com.BistecGlobal;

//import antlr.collections.List;
import java.util.List;

public interface ServicesUser {
	
/* in the interface we can create as a method,, just only call the function,, the implementation 
 * should be in another class*/
	List<UserDTO> UserInterface();
	
	String saveUser(UserDTO Userdata);



}
