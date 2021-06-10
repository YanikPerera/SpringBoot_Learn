package com.BistecGlobal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryLogin extends JpaRepository<DomainLogin,Integer> {
	
	DomainLogin findByUsernameAndPassword(String username, String password);

	
	

}