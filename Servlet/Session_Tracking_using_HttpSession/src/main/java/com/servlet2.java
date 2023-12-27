package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class servlet2
 */
public class servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public servlet2() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Getting session from servlet1
		HttpSession session = request.getSession();
		String name = (String) session.getAttribute("name");

		PrintWriter out = response.getWriter();
		out.print("<h1>Welcome to Servlet2</h1>");
		out.print("<h2>welcome back " + name + "</h2>");
		
		out.print("<button value='remove'>Remove Session</button>");
		out.print("<button value='invalidate'>invalidate Session</button>");

		// Remove the session
		String remove = request.getParameter("remove");
		if (remove.equals("remove")) {
			session.removeAttribute("name");
		}

		// invalid the session
		
		String invalidate = request.getParameter("invalidate");
		if (invalidate.equals("invalidate")) {
			session.invalidate();
		}
	}
}