package com.springbootsecurity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.springbootsecurity.entities.User;
import com.springbootsecurity.service.UserService;

@Controller
public class LoginController {

	@Autowired
	private UserService service;
	
	@GetMapping({"/signin"})
	public String showLogin() {
		return "login";
	}
}