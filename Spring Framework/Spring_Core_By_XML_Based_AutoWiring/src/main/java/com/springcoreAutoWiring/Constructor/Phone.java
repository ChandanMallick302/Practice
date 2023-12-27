package com.springcoreAutoWiring.Constructor;

import java.util.Map;

public class Phone {

	private Map<String, Integer> phone;

	public Phone(Map<String, Integer> phone) {
		super();
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Phone [phone=" + phone + "]";
	}	
}