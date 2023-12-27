package com.springbootsecurity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.springbootsecurity.entities.User;
import com.springbootsecurity.repository.UserRepository;

import jakarta.servlet.http.HttpSession;

@Service
public class UserService {	

	@Autowired
	private UserRepository userRepository;

	public User saveUser(User users) {
		BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
		String encodedPassword = encoder.encode(users.getPassword());
		users.setPassword(encodedPassword);
		User user = userRepository.save(users);
		return user;
	}

	public User selectByEmail(String email) {
		User user = userRepository.findByEmail(email);
		return user;
	}

	public void removeSessionMessage() {
		HttpSession session = ((ServletRequestAttributes) (RequestContextHolder.getRequestAttributes()))
		.getRequest().getSession();
		session.removeAttribute("msg");
	}
}
