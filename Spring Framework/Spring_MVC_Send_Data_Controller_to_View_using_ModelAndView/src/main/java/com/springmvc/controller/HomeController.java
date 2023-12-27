package com.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public ModelAndView home(ModelAndView mv) {
		
		//Add model or data
		mv.addObject("name","Chandan");
		
		mv.addObject("roll",101);
		
		List<String> subjectList=new ArrayList<>();
		subjectList.add("math");
		subjectList.add("MIL");
		subjectList.add("Engilsh");
		mv.addObject("subject",subjectList);
		
		//set view
		mv.setViewName("home");
		return mv;
	}

	@RequestMapping("/login")
	public String login() {
		return "login";
	}
}
