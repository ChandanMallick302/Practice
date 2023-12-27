package com.hibernate.entity.EAGER_Loading;

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
public class House {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO )
	@Column(name = "h_id")
	private int id;
	
	private String sname;
	
	@ManyToMany(mappedBy = "house",fetch = FetchType.EAGER)
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