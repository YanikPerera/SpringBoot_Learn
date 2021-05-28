package com.BistecGlobal;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserDTO,Integer> {
	
	

}
