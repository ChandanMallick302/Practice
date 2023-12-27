package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@RequestMapping(path = "/home")
	public String home() {
		return "home";
	}
	@RequestMapping(path = "/search", method = RequestMethod.POST)
	public String searchName(@RequestParam("name")String name,Model m){
		System.out.println(name);
		m.addAttribute("name", name);
		return "search";
	}
}