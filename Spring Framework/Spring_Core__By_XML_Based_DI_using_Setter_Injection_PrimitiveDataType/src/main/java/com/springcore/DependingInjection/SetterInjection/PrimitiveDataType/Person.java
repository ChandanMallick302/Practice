package com.springcore.DependingInjection.SetterInjection.PrimitiveDataType;

public class Person {

	private int id;
	private String name;
	private String address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
//		System.out.println("Setter Injection : "+id);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
//		System.out.println("Setter Injection : "+name);
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
//		System.out.println("Setter Injection : "+address);
	}

}
