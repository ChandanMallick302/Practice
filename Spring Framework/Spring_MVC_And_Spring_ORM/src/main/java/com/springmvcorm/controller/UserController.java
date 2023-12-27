package com.springmvcorm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springmvcorm.Entity.User;
import com.springmvcorm.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService service;
	
	@RequestMapping(path ="/register", method = RequestMethod.GET)
	public String registerGet() {
		return "register";
	}
	@RequestMapping("/userregister")
	public String regiaterPost(@ModelAttribute User user, Model m ) {
		System.out.println(user);
		service.registerUser(user);
		m.addAttribute("user",user);
		return "success";
	}
}
