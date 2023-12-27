package com.springbootsecurity.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProfileController {

	@GetMapping(path = "/profile")
	@PreAuthorize("hasRole('ROLE_USER')")
	public String profile() {

		return "profile";
	}
}