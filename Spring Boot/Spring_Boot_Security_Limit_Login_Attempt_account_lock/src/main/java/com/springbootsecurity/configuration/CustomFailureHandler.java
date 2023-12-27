package com.springbootsecurity.configuration;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import com.springbootsecurity.entities.User;
import com.springbootsecurity.service.UserService;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class CustomFailureHandler extends SimpleUrlAuthenticationFailureHandler {

	@Autowired
	private UserService userService;

	@Override
	public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException exception) throws IOException, ServletException {

		String email = request.getParameter("email");
		User user = userService.selectByEmail(email);

		if (user != null) {
			if (user.isEnable()) {
				if (user.isAccountUnlocked()) {
					if (user.getFailedAttempt() < (userService.attempt_Time - 1)) {

						userService.increaseFailedAttempt(user);
					} else {
						userService.lock(user);
						exception = new LockedException("Account is Locked !! Failed Attempt 3 times");
					}
				} else if(!user.isAccountUnlocked()) {
					if(userService.unlockedAccountAfterTimeExpired(user)) {
						exception=new LockedException("your Account is now unblocked !! Please try agian for login");
					}else {
						double locktime=(userService.lock_duration_time)/60000;
						exception=new LockedException("Your Account is Locked !! Please try after "+locktime+" minutes");
					}
				}
			} else {
				exception=new LockedException(email+" is inactive--- Please verify the account");
			}
		}
		super.setDefaultFailureUrl("/signin?error");
		super.onAuthenticationFailure(request, response, exception);
	}

}
