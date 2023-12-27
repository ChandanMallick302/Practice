package com.hibernate.ManyToOne_And_OneToMany;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "brand")
public class Brand {

	@Id
	@GeneratedValue
	private int id;
	private String name;
	@ManyToOne
	private Electronics elctronic;

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

	public Electronics getElctronic() {
		return elctronic;
	}

	public void setElctronic(Electronics elctronic) {
		this.elctronic = elctronic;
	}

	public Brand() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Brand(int id, String name, Electronics elctronic) {
		super();
		this.id = id;
		this.name = name;
		this.elctronic = elctronic;
	}

	public Brand(String name, Electronics elctronic) {
		super();
		this.name = name;
		this.elctronic = elctronic;
	}

	@Override
	public String toString() {
		return "Brand [id=" + id + ", name=" + name + ", elctronic=" + elctronic + "]";
	}
}
