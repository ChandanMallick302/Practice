package com.tech.blog.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import com.tech.blog.dao.UserDao;
import com.tech.blog.entities.Message;
import com.tech.blog.entities.User;
import com.tech.blog.helper.ConnectionProvider;

/**
 * Servlet implementation class SignUPServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		String check = request.getParameter("check");
		if (check != null) {

			// get input from web
			String email = request.getParameter("email");
			String password = request.getParameter("password");

			// Create Connection
			Connection con = ConnectionProvider.getConnection();
			UserDao dao = new UserDao(con);
			
			User user = dao.getUserByEmailAndPassword(email, password);
			
			if(user==null) {
				// login error
//				out.print("Invalid details try again.....");
				
				Message m=new Message("Invalid Details ! Try with another....","error","alert-danger");
				HttpSession session = request.getSession();
				session.setAttribute("message", m);
				response.sendRedirect("LoginPage.jsp");
			}else {
				// login success
				HttpSession session =request.getSession();
				session.setAttribute("currentUser", user);
				response.sendRedirect("profile.jsp");
			}

		}

	}

}
