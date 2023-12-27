package com.hibernate.pojoClass;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Students {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String city;

	private Certificate certi;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Certificate getCerti() {
		return certi;
	}

	public void setCerti(Certificate certi) {
		this.certi = certi;
	}

	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Students(int id, String name, String city, Certificate certi) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.certi = certi;
	}

	public Students(String name, String city, Certificate certi) {
		super();
		this.name = name;
		this.city = city;
		this.certi = certi;
	}

	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", city=" + city + ", certi=" + certi + "]";
	}

}
