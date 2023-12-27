package com.hibernate.ManyToOne_And_OneToMany;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Electronics {

	@Id
	private int id;
	private String name;
	@OneToMany
	private List<Brand> brand;
	
	public Electronics(String name, List<Brand> brand) {
		super();
		this.name = name;
		this.brand = brand;
	}
	public Electronics(int id, String name, List<Brand> brand) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
	}
	public List<Brand> getBrand() {
		return brand;
	}
	public void setBrand(List<Brand> brand) {
		this.brand = brand;
	}
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
	public Electronics() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Electronics(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Electronics [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
