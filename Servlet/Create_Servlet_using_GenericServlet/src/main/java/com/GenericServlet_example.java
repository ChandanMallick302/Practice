package com;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class GenericServlet_example extends GenericServlet  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest res, ServletResponse resp) throws ServletException, IOException {
		
		System.out.println("This is servlet using GenericSevlet");
		resp.setContentType("text.html");
		PrintWriter out= resp.getWriter();
		out.print("<h1>This is servlet using GenericSevlet</h1>");
	}

}
