package com.hibernate.ManyToAny;

import java.util.List;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Electronicss")
public class Electronicss {

	@Id
	private int id;
	private String name;
	@ManyToAny
	@Cascade({ org.hibernate.annotations.CascadeType.ALL })
	@JoinTable(
	joinColumns = @JoinColumn(name = "electronic"),
	inverseJoinColumns = @JoinColumn(name = "brands"))
	private List<Brands1> brand;

	public Electronicss(String name, List<Brands1> brand) {
		super();
		this.name = name;
		this.brand = brand;
	}

	public Electronicss(int id, String name, List<Brands1> brand) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
	}

	public List<Brands1> getBrand() {
		return brand;
	}

	public void setBrand(List<Brands1> brand) {
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

	public Electronicss() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Electronicss(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Electronics [id=" + id + ", name=" + name + "]";
	}

}
