package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegisterController {

	@RequestMapping( path = "/register", method = RequestMethod.GET)
	public String register() {
		return "register";
	}
	@RequestMapping(path ="/createUser", method = RequestMethod.POST)
	public String registerPost(@RequestParam("name") String name) {
		System.out.println(name);
		return "register";
	}
}
