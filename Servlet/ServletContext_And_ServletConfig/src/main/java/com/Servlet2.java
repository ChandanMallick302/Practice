package com;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet2
 */
public class Servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public Servlet2() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletConfig config=getServletConfig();
		PrintWriter out=response.getWriter();
		out.print("<h1>Accessing config parameters in sevlet 2</h1>");
		out.print("sql = "+config.getInitParameter("sql"));
		out.print("\nMessage= "+config.getInitParameter("message"));
		
		out.print("<h1>Accessing context parameters in sevlet 2</h1>");
		ServletContext context=getServletContext();
		out.print("Driver Name= "+context.getInitParameter("driver"));
		out.print("<br>"+"URL= "+context.getInitParameter("url"));		
	}
	}