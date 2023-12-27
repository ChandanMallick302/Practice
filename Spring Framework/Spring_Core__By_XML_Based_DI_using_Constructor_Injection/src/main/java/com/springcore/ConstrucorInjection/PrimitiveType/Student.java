package com.springcore.ConstrucorInjection.PrimitiveType;

public class Student {

	private int id;
	private String name;
	private String address;
	public Student(int id, String name) {
		super();
		System.out.println("int, String Constructor is callig");
		this.id = id;
		this.name = name;
		
	}
	public Student(String name, String address) {
		super();
		System.out.println("String, String Constructor is callig");
		this.name = name;
		this.address = address;
	}
	
	public Student(int id, String name, String address) {
		super();
		System.out.println("int, String, String Constructor is callig");
		this.id = id;
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
}
