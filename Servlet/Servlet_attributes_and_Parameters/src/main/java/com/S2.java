package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class S2
 */
public class S2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public S2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("This is s2 service method");
		String n1 = request.getParameter("num1");
		int num1 = Integer.parseInt(n1);
		String n2 = request.getParameter("num2");
		int num2 = Integer.parseInt(n2);
		int mul=num1*num2;
		
		//get attribute
		int sum = (int) request.getAttribute("sum");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<h2>Sum is "+sum+"</h2>");
		out.print("<h2>multiplication is "+mul+"</h2>");
	}

}
