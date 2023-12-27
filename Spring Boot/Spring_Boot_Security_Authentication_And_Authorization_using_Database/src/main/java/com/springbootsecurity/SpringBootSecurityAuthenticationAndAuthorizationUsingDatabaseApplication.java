package com.springbootsecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SpringBootSecurityAuthenticationAndAuthorizationUsingDatabaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurityAuthenticationAndAuthorizationUsingDatabaseApplication.class, args);
		
		
	}

}
