package com.hibernate.entity;

import java.util.List;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "persons")
@Data
public class Person {
	@Id
	@GeneratedValue
	@Column(name = "p_id")
	private int id;
	private String pname;
	@ManyToAny
	@JoinTable(name = "P-h_Relaton_Table", joinColumns =@JoinColumn(name = "person") ,inverseJoinColumns = @JoinColumn(name = "house"))
	private List<House> house;
	
	public Person(String pname) {
		super();
		this.pname=pname;
	}
	public Person() {
		super();
	}
	
}