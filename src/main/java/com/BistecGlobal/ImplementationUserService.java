package com.BistecGlobal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


// here we should have to define this is a service 
@Service
public class ImplementationUserService implements ServicesUser {
	
	@Autowired
	private UserRepository userrepository;

	@Override
	public List<UserDTO> UserInterface() {
		
	List<UserDTO> allusers = userrepository.findAll();
	
	return allusers;
		
		// here we can add data base connection to show as output all users 
		
		//return "ALL USERS HERE";
		
	}

	@Override
	public String saveUser(UserDTO Userdata) {
		// TODO Auto-generated method stub
		userrepository.save(Userdata);
		return "Data saved";
	}
	
	

}

