package com.springcore.Annotation_AutoWiring.inConstructorAutowired;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

	private int id;
	private String name;
	private Phone phone;
	
	// in constructor injection there is no @autowired required
	public Employee(int id, String name, Phone phone) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", phone=" + phone + "]";
	}
}
