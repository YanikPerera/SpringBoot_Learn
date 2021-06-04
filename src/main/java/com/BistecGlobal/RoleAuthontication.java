package com.BistecGlobal;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class RoleAuthontication extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http 
		.cors().and()
	        .csrf().disable().authorizeRequests()
	        .antMatchers("/user").hasRole("manager")
	        .anyRequest().authenticated()
	        .and()
	        .formLogin();
		
		// TODO Auto-generated method stub
		//super.configure(http);
	}
	
	

}
