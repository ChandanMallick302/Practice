package com.springbootsecurity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.springbootsecurity.entities.User;
import com.springbootsecurity.service.UserService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class RegisterController {

	@Autowired
	private UserService userService;

	@GetMapping({ "/register" })
	public String register() {
		return "register";
	}
	
	@PostMapping("/saveUser")
	public String userRegister(@ModelAttribute User users, HttpSession session,HttpServletRequest req) throws Exception {
		
		//create url http://localhost:8080/ 
		String url = req.getRequestURL().toString();
		url= url.replace(req.getServletPath(), "");
		
		User user = userService.saveUser(users,url);
		if (user != null) {
			session.setAttribute("msg", "registration sucessfull");
		} else {
			session.setAttribute("msg", "registration failed");
		}
		return "redirect:/register";
	}
	
	// to verify the verification code and make it empty in database after verify
	@GetMapping("/verify")
	public String verifyAccount(@Param("code") String code,Model m) {
		boolean verifyAccount = userService.verifyAccount(code);
		
		if(verifyAccount==true) {
			m.addAttribute("msg","Sucessfully your account is verified");
		}
		else {
			m.addAttribute("msg","may be your verification code is incorrect or already verfied");
		}
		return "message";
	}
}