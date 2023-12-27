package com.springmvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import jakarta.servlet.annotation.MultipartConfig;


@Controller
@MultipartConfig(maxFileSize = 100000)
public class FileUploadController {

	@RequestMapping("/fileupload")
	public String fileupload() {
		return "fileform";
	}
	@RequestMapping(path = "/uplaodfile",method = RequestMethod.POST)
	public String filedisplay(@RequestParam("image") MultipartFile file) {
		System.out.println(file.getName());
		return "fileform";
	}
}
