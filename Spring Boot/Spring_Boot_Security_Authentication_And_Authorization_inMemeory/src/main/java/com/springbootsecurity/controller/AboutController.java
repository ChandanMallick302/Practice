package com.springbootsecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AboutController {

	@RequestMapping(path =  {"/about"})
	public String about() {
		
		return "about";
	}
}