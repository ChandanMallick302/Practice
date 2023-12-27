package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MySearchController {

	@RequestMapping("/mysearch")
	public String mySearchGET() {
		return "mysearch";
	}
	@RequestMapping(path = "/search",method = RequestMethod.POST)
	public String mySearchPOST(@RequestParam("keyword") String keyword) {
		
		String url="http://www.google.com/search?q="+keyword;
		return "redirect:"+url;
	}
}