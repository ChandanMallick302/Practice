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
		m.addAttribute("today", new Date());
		
		User user1=new User(1,"Chandan","India");
		User user2=new User(2,"Rajesh","USA");
		
		m.addAttribute("user1",user1);
		m.addAttribute("user2",user2);
		return "index";
	}
	
	@GetMapping(path = "/profile")	
	public String profile(Model m) {
		boolean x=false;
		boolean y=true;
		m.addAttribute("f", x);
		m.addAttribute("t", y);
		m.addAttribute("x",null);
		m.addAttribute("name","Chandan");
		User user1=new User(1,"Chandan","India");
		m.addAttribute("user1", user1);
		
		User u1=new User(1,"Chandan","India");
		User u2=new User(2,"Rajesh","USA");
		User u3=new User(3,"Prakash","CANADA");
		User u4=new User(4,"Rohit","USSR");
		User u5=new User(5,"Ramesh","PAKISTAN");
		
		List user=Arrays.asList(u1,u2,u3,u4,u5);
		
		m.addAttribute("u", user);
		return "profile";
	}
}
