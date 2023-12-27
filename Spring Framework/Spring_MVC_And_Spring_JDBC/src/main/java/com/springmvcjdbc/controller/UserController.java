package com.springmvcjdbc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springmvcjdbc.model.User;
import com.springmvcjdbc.service.UserServiceImpl;

@Controller
public class UserController {
	
	@Autowired
	private UserServiceImpl userServiceImpl;

	@RequestMapping(path = "/register", method = RequestMethod.GET)
	public String registerGET() {
		return "register";
	}

	@RequestMapping(path = "/userregister", method = RequestMethod.POST)
	// to get data from view used @ModelAttribute and to give data from controller used Model
	public String registerPost(@ModelAttribute User user, Model m) {
		System.out.println(user);
		int saveUser = userServiceImpl.registerUser(user);
//		if(saveUser>0) {
//			m.addAttribute("success","Sucessfully Registered");	
//		}
		
//		return "redirect:/register";
		
		m.addAttribute("user",user);
		return "success";
	}
}