package com.hibernate.ManyToAny;

import java.util.List;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "brands")
public class Brands1 {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	@ManyToOne
	private Electronicss electronic ;

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

	public Electronicss getElctronic() {
		return electronic;
	}

	public void setElctronic(Electronicss electronic) {
		this.electronic = electronic;
	}

	public Brands1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Brands1(int id, String name, Electronicss elctronic) {
		super();
		this.id = id;
		this.name = name;
		this.electronic = elctronic;
	}

	public Brands1(String name, Electronicss elctronic) {
		super();
		this.name = name;
		this.electronic = elctronic;
	}
	

	public Brands1(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Brand [id=" + id + ", name=" + name + ", elctronic=" + electronic + "]";
	}
}
