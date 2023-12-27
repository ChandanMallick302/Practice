package com.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public ModelAndView home(ModelAndView mv) {
		mv.addObject("name","Chandan");
		mv.addObject("roll",1234);
		List<String> sublist=new ArrayList();
		sublist.add("Math");
		sublist.add("English");
		sublist.add("Odia");
		
		mv.addObject("subject",sublist);
		
		mv.setViewName("home");
		return mv;
	}
}
