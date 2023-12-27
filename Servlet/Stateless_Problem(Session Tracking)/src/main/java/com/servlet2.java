package com;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		try(PrintWriter out=response.getWriter()){
			out.print("<!DOCTYPE html>");
			out.print("<html>");
			out.print("<title>Servlet2</title>");
			out.print("<head>");
			out.print("<body>");
			
			String name = request.getParameter("name");
			out.print("<h1 style='color:red'>Hello, "+name+" Wecome to my website</h1>");
			out.print("<h2>Thank you</h2>");
			out.print("</body>");
			out.print("</html>");
		}
	}

}
