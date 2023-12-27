package com.hibernate.Using_XmlFile.entity;

import java.util.Date;

import lombok.Data;

@Data
public class Orders1 {

	private int id;
	private Customer1 customer;
	
	private Date date;
	
	private Orders1 order; 
	
	public Orders1(){
		super();
	}
	public Orders1(int id) {
		super();
		this.id=id;
	}
}
