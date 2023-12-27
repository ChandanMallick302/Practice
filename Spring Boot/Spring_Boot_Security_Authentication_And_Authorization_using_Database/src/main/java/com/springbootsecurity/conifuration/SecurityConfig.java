package com.springbootsecurity.conifuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig {

	@Bean
	public PasswordEncoder encoder() {

		return new BCryptPasswordEncoder();
	}

	@Bean
	public UserDetailsService detailsService() {

		return new CustomUserDetailsService();
	}

	@Bean
	public DaoAuthenticationProvider authenticationProvider() {
		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
		provider.setPasswordEncoder(encoder());
		provider.setUserDetailsService(detailsService());
		return provider;
	}

	@Bean
	public SecurityFilterChain chain(HttpSecurity http) throws Exception {
		http.csrf().disable().authorizeRequests().requestMatchers("/", "/home").permitAll().anyRequest().authenticated()
				.and().formLogin();
		return http.build();
	}
}
