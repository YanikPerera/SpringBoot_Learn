package com.BistecGlobal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


// here we should have to define this is a service 
@Service
public class ImplementationUserService implements ServicesUser {
//this also dependency injection 
	@Autowired
	private UserRepository userrepository;

	@Override
	public List<UserDTO> UserInterface() {
// here we can get users as a list by using List<UserDTO>
	List<UserDTO> allusers = userrepository.findAll();
//this is UserDTO list pass though the return
	return allusers;
		
		// here we can add data base connection to show as output all users 
		
		//return "ALL USERS HERE";
		
	}
// this is create for add users 
	@Override
	public String saveUser(UserDTO Userdata) {
		// TODO Auto-generated method stub
		userrepository.save(Userdata);
		return "Data saved";
	}
//this method use for update the existing users 	
	@Override
	public String UpdateUser(UserDTO newUserData) {
		String msg = null;
//here we can check the user is already exist or not by getid() function use as follows
		if(newUserData.getId() != null) {
			userrepository.save(newUserData);
		msg = "Data updated";
		return msg;
		}else { 
			throw new UserNotFoundException("Please Put the User ID"+newUserData.getId());
			
		}
		// TODO Auto-generated method stub
		
	}
	
//here we can be able to return the id of the user which is require from the link address
	
/*	@Override
	public UserDTO findById(long id) {
		
		if(id==null) {
			
			throw new UserNotFoundException("Please Put the User ID"+id);
			
		}else {
			
			
			return userrepository.findOne(id);
		} 
		// TODO Auto-generated method stub
		
		
		
	}*/
	
	
	
	

}

