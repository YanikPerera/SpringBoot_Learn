package com.BistecGlobal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceLogin {

	@Autowired
	
	private RepositoryLogin repo;
	
	public DomainLogin login(String username, String password) {
		
		DomainLogin domlog = repo.findByUsernameAndPassword(username, password);
				return domlog;
		
	}
}
