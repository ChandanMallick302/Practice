package com.springcore.By_Annotation_Based_Configuration.ConstructorInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("emp")
public class Employee {

	@Value("1")
	private int id;
	@Value("Rajesh")
	private String name;
	
	@Autowired
	private Address address;

	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	
	public Employee(Address address) {
		super();
		this.address = address;
	}

	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
}
