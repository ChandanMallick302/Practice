package com.debug.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/about")
	public String getAbout() {
		//Add break point
		String str="Hello World!!";
		//Add break point
		str=str.toLowerCase();
		//Add break point
		str=str.toUpperCase();
		//Add break point
		return str;
	}
}
