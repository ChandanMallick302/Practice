package com.springbootsecurity.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.springbootsecurity.entiries.Employee;
import com.springbootsecurity.repository.EmployeeRepository;

public class CustomUserService implements UserDetailsService {

	@Autowired
	private EmployeeRepository repository;
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Employee emp = repository.findByEmail(email);
		
		if(emp==null) {
			throw new UsernameNotFoundException("User Name Not Found");
		}else {
		
			return new CustomUser(emp);
		}
	}

}
