package com.springbootsecurity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.springbootsecurity.entities.User;
import com.springbootsecurity.service.UserService;

import jakarta.servlet.http.HttpSession;

@Controller
public class RegisterController {

	@Autowired
	private UserService userService;

	@GetMapping({ "/register" })
	public String index() {
		return "register";
	}

	@PostMapping("/saveUser")
	public String userRegister(@ModelAttribute User users, HttpSession session) {

		User user = userService.saveUser(users);
		if (user != null) {
			System.out.println("save sucess");
			System.out.println(users.getName());
			session.setAttribute("msg", "registration sucessfull");
		} else {
			System.out.println("save failed");
			session.setAttribute("msg", "registration failed");
		}
		return "redirect:/register";
	}
}