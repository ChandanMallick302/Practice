package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet{

	public void doGet(HttpServletRequest req, HttpServletResponse resp)throws ServletException,IOException {
		System.out.println("ohis is doGet() method");
		PrintWriter out = resp.getWriter();
		resp.setContentType("text.html");
		out.print("<h1>This is doGet( method)....");
	}
	public void service(HttpServletRequest req, HttpServletResponse resp)throws ServletException,IOException {
		System.out.println("This is service() method");
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		out.print("<h1>This is service( method)....");
		out.print("<br>"+new Date().toString());
		
	}
	public void doPost(HttpServletRequest req, HttpServletResponse resp)throws ServletException,IOException {
		System.out.println("This is doPost() method");
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html");
		out.print("<h1>This is doPost( method)....");
	}
}
