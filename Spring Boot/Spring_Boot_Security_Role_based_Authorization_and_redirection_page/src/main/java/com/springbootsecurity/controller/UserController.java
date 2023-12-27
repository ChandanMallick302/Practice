package com.springbootsecurity.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.springbootsecurity.entities.User;
import com.springbootsecurity.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService service;
	
	@GetMapping("/user/profile")
	public String profile(Principal p, Model m) {
		String email = p.getName();
		User user = service.selectByEmail(email);
			m.addAttribute("user",user);
		return "user_profile";
	}
}
