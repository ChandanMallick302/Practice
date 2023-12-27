package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.http.HttpSession;

@Controller
@MultipartConfig(maxFileSize = 100000)
public class HomeController {

	@RequestMapping("/home")
	public String home() {
		return "home";
	}

	@RequestMapping(path = "/fileupload", method = RequestMethod.POST)
	public String fileuploadPOST(@RequestParam("file") MultipartFile m1, HttpSession session)
			throws Exception {
//		m1.transferTo(new File("resource/img/"));
		System.out.println(m1.getName());
		return "home";
	}
}