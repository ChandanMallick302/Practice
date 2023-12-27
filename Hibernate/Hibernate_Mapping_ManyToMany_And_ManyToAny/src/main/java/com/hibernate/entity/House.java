package com.hibernate.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "house")
@Data
public class House {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	@Column(name = "h_id")
	private int id;
	
	private String sname;
	
	@ManyToMany(mappedBy = "house")
	private List<Person> person;
	
	public House(String sname) {
		super();
		this.sname=sname;
	}
	
	
	public House() {
		super();
	}


	public House(String sname, List<Person> person) {
		super();
		this.sname = sname;
		this.person = person;
	}
	
	
}