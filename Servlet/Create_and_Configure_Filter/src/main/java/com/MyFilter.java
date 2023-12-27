package com;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet Filter implementation class MyFilter
 */
public class MyFilter extends HttpFilter implements Filter {
       
    /**
     * @see HttpFilter#HttpFilter()
     */
    public MyFilter() {
        super();
        // TODO Auto-generated constructor stub
    }
	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("Pre Processing");
		PrintWriter out = response.getWriter();
		HttpServletRequest req=(HttpServletRequest)request;
		String user =req.getParameter("user");
		String name = req.getParameter("name");
		System.out.println(name);
		
		// Set to a session
		HttpSession session = req.getSession();
		session.setAttribute("name", name);
		session.setAttribute("user",user);
		response.setContentType("text/html");
		
		// forward to servlet with conditioning
		if((name!=""&& user!="")) {
		//forward to another resource
		chain.doFilter(request, response);
		}
		else {
			RequestDispatcher rd = req.getRequestDispatcher("index.html");
			rd.include(req, response);
			out.print("<h3><span style='color:red'>Please check the input</span></h3>");
		}
		System.out.println("Post Processing");
	}
	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */

}
