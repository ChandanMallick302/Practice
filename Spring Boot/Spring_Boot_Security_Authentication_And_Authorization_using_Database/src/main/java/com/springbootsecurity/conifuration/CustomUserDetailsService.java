package com.springbootsecurity.conifuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.springbootsecurity.entities.Employee;
import com.springbootsecurity.repositories.EmployeeRepository;

public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private EmployeeRepository emprepository;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

		Employee emp = emprepository.findByEmail(email);

		if (emp == null) {
			throw new UsernameNotFoundException("User Name Not Found");
		} else {
			return new CustomUserDetails(emp);
		}
	}
}