package com.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home(Model model) {
		model.addAttribute("name","Chandan");
		model.addAttribute("roll",203);
		List<String> studentList=new ArrayList();
		studentList.add("Rahul");
		studentList.add("Rohit");
		studentList.add("Ramesh");
		model.addAttribute("studentlist",studentList);
		return "home";
	}

	@RequestMapping("/login")
	public String login() {
		return "login";
	}
}
