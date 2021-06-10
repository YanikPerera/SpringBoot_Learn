package com.BistecGlobal;


import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControllerLogin {
	
	@Autowired
	private ServiceLogin servicelogin;
	
	@GetMapping("/login")
	public ModelAndView login() {
		ModelAndView mav = new ModelAndView("login");
		mav.addObject("domainlogin", new DomainLogin());
		return mav;
		
		
	}
	@PostMapping("/login")
	public String login(@ModelAttribute("login") DomainLogin domainlogin ) {
		DomainLogin oauthUser = servicelogin.login(domainlogin.getUsername(),domainlogin.getPassword());
		System.out.print(oauthUser);
		if (Objects.nonNull(oauthUser)) 
		{
			return "sucess";
			
		}
		else {
			return "error";
			
		}
		
		
	}

}
