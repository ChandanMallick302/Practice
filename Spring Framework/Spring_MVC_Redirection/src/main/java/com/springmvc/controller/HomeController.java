package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home() {
		return "home";
	}
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	//Redirect by: redirect:
	@RequestMapping("/google")
	public String google() {
		return "redirect:https://www.google.com";
	}
	
	//Redirect by: RedirectView Class
	@RequestMapping("/yahoo")
	public RedirectView yahoo() {
		RedirectView redirect=new RedirectView();
		redirect.setUrl("https://in.yahoo.com");
		return redirect;
	}
}
