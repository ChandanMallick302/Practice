package com.springmvc.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Myinterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("This is pre-handler Working..");
		String name = request.getParameter("name");
		if (name.startsWith("C")) {
			response.setContentType("text/html");
			response.getWriter().println("<h1 align='center'>Invaild name... Name should not start with 'c'</h1>");
			return false;
		}

		return true;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("This is postHandle Working");

		HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("This is afterCompletion Working");
		HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
	}

}
