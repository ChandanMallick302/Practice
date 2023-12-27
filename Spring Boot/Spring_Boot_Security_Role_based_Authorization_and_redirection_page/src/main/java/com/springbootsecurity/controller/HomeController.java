package com.springbootsecurity.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.springbootsecurity.entities.User;
import com.springbootsecurity.service.UserService;

@Controller
public class HomeController {
	
	@Autowired
	private UserService service;

	@GetMapping({"/","/index"})
	public String index() {
		return "index";
	}
	
	@GetMapping("/user/home")
	public String home() {
		return "home";
	}
	
	@ModelAttribute
	public void commonUser(Principal p,Model m) {
		if(p!=null) {
			String email = p.getName();
			User user = service.selectByEmail(email);
			m.addAttribute("user",user);
		}
	}
	
}
