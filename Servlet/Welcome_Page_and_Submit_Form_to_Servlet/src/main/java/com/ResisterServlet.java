package com;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ResisterServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		out.print("<h1>Welcome to Resister servlet<h1/>");

		String name = req.getParameter("name");
		String password = req.getParameter("password");
		String email = req.getParameter("email");
		String gender = req.getParameter("gender");
		String course = req.getParameter("course");

		String condition = req.getParameter("condition");

		if (condition != null) {

			if (condition.equals("checked")) {
				out.print("<h2>Name: " + name + "<h2/><br>");
				out.print("<h2>Password: " + password + "<h2/><br>");
				out.print("<h2>Email: " + email + "<h2/><br>");
				out.print("<h2>Gender: " + gender + "<h2/><br>");
				out.print("<h2>Course: " + course + "<h2/>");
				
				RequestDispatcher rd = req.getRequestDispatcher("/SucessServlet");
				rd.forward(req, resp);

			} else {
			}
		} else {
			RequestDispatcher rd = req.getRequestDispatcher("/index.html");
			rd.include(req, resp);
			out.print("<h2><span style='color:red'>You have not accepted tems and condition<span></h2>");

		}
	}
}
