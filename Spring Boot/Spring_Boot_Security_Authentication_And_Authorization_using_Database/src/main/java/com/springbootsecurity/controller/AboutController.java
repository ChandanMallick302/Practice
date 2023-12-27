package com.springbootsecurity.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutController {

	@GetMapping(path = "/about")
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public String home() {
		
		return "about";
	}
}