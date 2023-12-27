package com.tech.blog.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

import com.tech.blog.dao.UserDao;
import com.tech.blog.entities.Message;
import com.tech.blog.entities.User;
import com.tech.blog.helper.ConnectionProvider;

/**
 * Servlet implementation class RegisterServlet
 */
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String check = request.getParameter("check");
		response.setContentType("text/html;charset=UTF-8");
		if(check!=null) {
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			String gender = request.getParameter("gender");
			String about = request.getParameter("about");
			
			//Create User object and set into that
			
			User u=new User();
			u.setName(name);
			u.setEmail(email);
			u.setPassword(password);
			u.setGender(gender);
			u.setAboout(about);
			
			
			//Create userdao object
			UserDao dao=new UserDao(ConnectionProvider.getConnection());
			try {
				if(dao.saveUser(u)) {
					Message m=new Message("Registration successful, Now Login","Resister-success","alert-success");
					HttpSession session = request.getSession();
					session.setAttribute("message", m);
					response.sendRedirect("LoginPage.jsp");
				}else {
					out.print("Error");
					response.sendRedirect("RegisterPage.jsp");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		else {
			out.print("Please selcet Agree Term & Condition");
		}
		
	}

}
