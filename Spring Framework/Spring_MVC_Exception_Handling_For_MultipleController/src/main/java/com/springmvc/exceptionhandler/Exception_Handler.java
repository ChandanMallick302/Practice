package com.springmvc.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@ControllerAdvice
public class Exception_Handler {

	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(NullPointerException.class)
	public String NullpoinerExceptionHandler(Model m) {
		m.addAttribute("msg","NullPointer Exception occured");
		return "exception_page";
	}
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(NumberFormatException.class)
	public String NumberformatExceptionHandler(Model m) {
		m.addAttribute("msg","NumberFormat Exception occured");
		return "exception_page";
	}
}
