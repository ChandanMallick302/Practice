package com;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class S1
 */
public class S1 extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("This is s1 service method");
		String n1 = request.getParameter("num1");
		int num1 = Integer.parseInt(n1);
		String n2 = request.getParameter("num2");
		int num2 = Integer.parseInt(n2);
		int sum=num1+num2;
		
		//set attribute
		request.setAttribute("sum", sum);
		
		//forward to s2
		System.out.println("froward from s1 to s2");
		RequestDispatcher rd = request.getRequestDispatcher("/S2");
		rd.forward(request, response);
	}

}
