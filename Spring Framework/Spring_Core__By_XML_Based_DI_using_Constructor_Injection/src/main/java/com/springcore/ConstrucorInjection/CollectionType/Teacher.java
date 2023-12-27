package com.springcore.ConstrucorInjection.CollectionType;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Teacher {

	private int id;
	private String name;
	
	
	private List<String> subject;
	private Set<Integer> phone;
	private Map<String, String> address;
	
	
	public Teacher(int id, String name, List<String> subject, Set<Integer> phone, Map<String, String> address) {
		super();
		this.id = id;
		this.name = name;
		this.subject = subject;
		this.phone = phone;
		this.address = address;
	}


	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", subject=" + subject + ", phone=" + phone + ", address="
				+ address + "]";
	}
}
