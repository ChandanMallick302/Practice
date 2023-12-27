package com.springbootsecurity.configuration;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.springbootsecurity.entiries.Employee;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CustomUser implements UserDetails {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7836802209280489620L;
	
	private Employee emp;
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		
		return Arrays.asList(new SimpleGrantedAuthority(emp.getRole())) ;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return emp.getPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return emp.getPassword();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
