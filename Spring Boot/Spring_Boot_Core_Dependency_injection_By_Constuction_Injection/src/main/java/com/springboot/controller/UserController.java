package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.service.UserService;

@Controller
public class UserController {

	private UserService service;
	
	
	
	public UserController(UserService service) {
		super();
		this.service = service;
	}



	@RequestMapping("/register")
	public String createUser() {
		String msg = service.saveUser();
		System.out.println(msg);
		return "success";
	}
}
