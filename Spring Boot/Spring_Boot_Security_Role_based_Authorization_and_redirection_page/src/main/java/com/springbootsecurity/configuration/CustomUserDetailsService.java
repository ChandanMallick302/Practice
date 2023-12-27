package com.springbootsecurity.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.springbootsecurity.entities.User;
import com.springbootsecurity.service.UserService;

public class CustomUserDetailsService implements UserDetailsService {
	
	@Autowired
	private UserService userService;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		User user = userService.selectByEmail(email);
		
		if(user==null) {
			throw new UsernameNotFoundException("User Name Not Found");
		}
		else {
			return new CustomUserDetails(user);
		}
	}

}