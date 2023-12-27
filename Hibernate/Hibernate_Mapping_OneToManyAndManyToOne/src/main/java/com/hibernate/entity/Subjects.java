package com.hibernate.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "subject")
@Data
public class Subjects {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "s_id")
	private int id;

	private String sname;

	@OneToMany
	@JoinColumn(name = "tid")
	private List<Topics> topics;

	public Subjects(String sname, List<Topics> topics) {
		super();
		this.sname = sname;
		this.topics = topics;
	}

	public Subjects() {
		// TODO Auto-generated constructor stub
	}

}