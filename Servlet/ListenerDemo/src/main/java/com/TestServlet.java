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
 * Servlet implementation class TestServlet
 */
@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public TestServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		System.out.println("session Created, listener will be invoked");
		out.print("<h1>session Created, listener will be invoked</h1><br>");
		session.setAttribute("username", "Tom");
		session.setAttribute("password", "jerry");
		System.out.println("session attribute displayed. listener to come here");
		out.print("<h1>session attribute displayed. listener to come here</h1><br>");
		session.setAttribute("username", "jim");
		System.out.println("Attributes modified, listener will be invoked");
		out.print("<h1>Attributes modified, listener will be invoked</h1>");
		session.invalidate();
		System.out.println("session destroyed");
		
	}
}