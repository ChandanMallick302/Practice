package com.springmvc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.springmvc.entity.User;

import jakarta.servlet.http.HttpSession;

@Controller
public class homeController {

	@RequestMapping("/home")
	public String home() {
		String str=null;
		System.out.println(str.length());	
		return "home";
	}
	
	@RequestMapping(path = "/submitform", method = RequestMethod.POST)
	public String form(@ModelAttribute("user") User user,BindingResult result,HttpSession session) {
		System.out.println(user);
		session.setAttribute("user1",User.class);
		return "home";
	}
}