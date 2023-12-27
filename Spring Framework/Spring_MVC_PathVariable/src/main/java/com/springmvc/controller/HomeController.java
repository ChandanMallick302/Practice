package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping(path = "/home/{name}/{job}")
	public String home(@PathVariable("name") String name,@PathVariable("job") String job , Model m) {
		m.addAttribute("name",name);
		m.addAttribute("job",job);
		System.out.println("Name: "+name);
		System.out.println("Job: "+job);
		return "home";
	}
}
