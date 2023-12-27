package com.springcoreAutoWiring.Constructor;

public class Employee {

	private int id;
	private String name;
	
	private Phone phone;

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
