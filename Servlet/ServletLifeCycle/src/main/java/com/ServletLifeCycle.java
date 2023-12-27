package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
public class ServletLifeCycle extends HttpServlet {

	ServletConfig config;

	// servlet life cycle method
	public void init(ServletConfig config) {
		this.config = config;
		System.out.println("Creating object.......");
	}

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		System.out.println("Servicing......");
//		set the content type of the response
		res.setContentType("text.html");
		PrintWriter out = res.getWriter();
		out.print("<h1>This is my output from servlet method()<h1>");
		out.print("<h1>Todays date and time is "+new Date().toString()+"</h1>");
	}

	public void destroy() {
		System.out.println("going to destroy servlet object");
	}

	// servlet non-life cycle method
	public ServletConfig getServletConfig() {
		return config;
	}

	public String getServletInfo() {
		return "this servlet is created by chandan";
	}
}
