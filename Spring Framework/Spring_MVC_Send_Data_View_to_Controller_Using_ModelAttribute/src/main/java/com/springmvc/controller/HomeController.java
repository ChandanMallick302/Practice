package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springmvc.model.User;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home() {
		return "home";
	}
	@RequestMapping( path = "/register", method = RequestMethod.GET)
	public String register() {
		return "register";
	}
	@RequestMapping(path ="/createUser", method = RequestMethod.POST)
	public String registerPost(@ModelAttribute User user) {
		System.out.println(user);
		return "register";
	}
}