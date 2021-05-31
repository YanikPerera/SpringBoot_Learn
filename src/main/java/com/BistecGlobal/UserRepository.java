package com.BistecGlobal;

import org.springframework.data.jpa.repository.JpaRepository;
//here if we want use JPA we should the interface extend to JpaRepository
// then after its requried 2 parameters ,, we should have to define what is the data layer and what is the id
//when extend JpaRepository we can access inside functionality of the interface
public interface UserRepository extends JpaRepository<UserDTO,Integer> {
	
	// we can proceed here our crud operations 
	//getALLusers
	//find-by-id
	//delete
	//update
	//custom query

}
