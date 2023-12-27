package com.hibernate.entity.LAZY_Loading;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "house")
@Data
public class House1 {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	@Column(name = "h_id")
	private int id;
	
	private String sname;
	
	@ManyToMany(mappedBy = "house",fetch = FetchType.LAZY)
	private List<Person1> person;
	
	public House1(String sname) {
		super();
		this.sname=sname;
	}
	
	public House1() {
		super();
	}


	public House1(String sname, List<Person1> person) {
		super();
		this.sname = sname;
		this.person = person;
	}
	
	
}
