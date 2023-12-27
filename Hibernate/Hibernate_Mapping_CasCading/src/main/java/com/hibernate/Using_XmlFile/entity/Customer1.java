package com.hibernate.Using_XmlFile.entity;

import java.util.List;

import lombok.*;

@Data
public class Customer1 {
	private int id;
	private String name;
	private List<Orders1> orders;
	public Customer1(){
		super();
	}
	public Customer1(String name) {
		super();
		this.name=name;
	}
	
	
}
