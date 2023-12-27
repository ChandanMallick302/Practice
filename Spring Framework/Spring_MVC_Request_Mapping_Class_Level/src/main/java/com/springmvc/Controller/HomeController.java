package com.springmvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/site")
public class HomeController {
	
	@RequestMapping("/home")
	public String home() {
		return "home";
	}
	
	//We can achieve home page by write url "localhost:8080/site/home"
}
