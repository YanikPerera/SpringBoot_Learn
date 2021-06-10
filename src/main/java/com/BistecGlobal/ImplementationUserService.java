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
	
//here i have added if condition for check the passed user list is empty or any values in there
// if its empty for end user its passed the empty list of users 
// to avoid for that here if condition its check all users its empty if so its throw to the exception class with 
// with error msg("There is no Users currently we have") for end user 
// throw exception handle by the UserNotFoundException java class
	if(allusers == null) {
		
		throw new UserNotFoundException("There is no Users cuurently we have");
		
	}else {
//this is UserDTO list pass though the return
	return allusers;
	}
		// here we can add data base connection to show as output all users 
		
		//return "ALL USERS HERE";
		
	}
// this is create for add users 
	@Override
	public String saveUser(UserDTO Userdata) {
//here i have added if condition for check going to save member dosen't have first name and their last name(as required filed)
// if its empty for end user its passed error msg to the end user
// to avoid for that here if condition its check the user name and his email  address is input in the fields 
// if not i have passed with error msg("Employee first name and Email Address is mandatory") for end user 
// throw exception handle by the UserNotSavedException java class
		if(Userdata.getFirstName() ==null || Userdata.getEmail() ==null ) {
			
			throw new UserNotSavedException("Employee first name and Email Adress is mandatory"+Userdata.getId());
		}
		else {
		// TODO Auto-generated method stub
			
			userrepository.save(Userdata);
			return "Data saved";
		}
	}
//this method use for update the existing users 	
	@Override
	public String UpdateUser(UserDTO newUserData) {
		String msg = null;
		//@Query("SELECT user_id from user")
//here i have added if condition for check the update needs user does have id
// if its empty for end user its passed error msg to the end user
// to avoid for that here if condition its check the users id is already put in to the update filed
// if not i have passed with error msg("Please Put the User ID") for end user 
// throw exception handle by the UserNotFoundException java class
//here we can check the user is already exist or not by getid() function use as follows
		if(newUserData.getId() != null ) {
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

