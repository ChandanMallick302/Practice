package com.springmvc.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springmvc.entity.User;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class homeController {

	@RequestMapping("/home")
	public String home() {
		return "home";
	}
	
	@RequestMapping(path = "/submitform", method = RequestMethod.POST)
	public String form(@ModelAttribute("user") User user,BindingResult result,HttpSession session) {
		System.out.println(user);
		session.setAttribute("user1",User.class);
		return "home";
	}
}