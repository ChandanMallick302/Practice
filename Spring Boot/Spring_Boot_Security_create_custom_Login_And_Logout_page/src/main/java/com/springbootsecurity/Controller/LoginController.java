package com.springbootsecurity.Controller;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
public class LoginController {

	@GetMapping("/login")
	public String showLoginPage() {
		return "login";
	}
	@GetMapping("/signout")
	public String showsignout(HttpSession session,HttpServletResponse resp) throws Exception {
		session.setAttribute("msg", "logout sucessfull");
		return "signout";
	}
}