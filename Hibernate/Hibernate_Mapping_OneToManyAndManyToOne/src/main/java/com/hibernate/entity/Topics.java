package com.hibernate.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table
@Data
public class Topics {
	@Id
	@GeneratedValue
	@Column(name = "t_id")
	private int id;
	private String tname;
	@ManyToOne
	@JoinColumn(name="sid")
	private Subjects subjects;
	
	public Topics(String tname) {
		super();
		this.tname=tname;
	}
	public Topics() {
		// TODO Auto-generated constructor stub
	}
	
}
