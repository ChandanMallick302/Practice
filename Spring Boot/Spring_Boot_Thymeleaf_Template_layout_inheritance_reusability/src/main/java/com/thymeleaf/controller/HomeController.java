package com.thymeleaf.controller;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.thymeleaf.entities.User;

@Controller
public class HomeController {

	@GetMapping(path = {"/"})
	public String index(Model m) {
		m.addAttribute("date",new Date());
		return "index";
	}
	
	@GetMapping(path = "/profile")	
	public String profile(Model m) {
		
		return "profile";
	}
	@GetMapping("/about")
	public String about() {
		
		return "about";
	}
}
