package com.hibernate.entity.LAZY_Loading;

import java.util.List;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "persons")
@Data
public class Person1 {
	@Id
	@GeneratedValue
	@Column(name = "p_id")
	private int id;
	private String pname;
	@ManyToAny
	@JoinTable(name = "P-h_Relaton_Table", joinColumns =@JoinColumn(name = "person") ,inverseJoinColumns = @JoinColumn(name = "house"))
	private List<House1> house;
	
	public Person1(String pname) {
		super();
		this.pname=pname;
	}
	public Person1() {
		super();
	}
	
}
