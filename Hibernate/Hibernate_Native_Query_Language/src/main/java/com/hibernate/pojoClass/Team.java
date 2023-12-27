package com.hibernate.pojoClass;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity(name = "team")
@Table(name = "team")
public class Team {

	@Id
	private int id;
	private String tname;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public Team() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Team(int id, String tname) {
		super();
		this.id = id;
		this.tname = tname;
	}

	@Override
	public String toString() {
		return "Team [id=" + id + ", tname=" + tname + "]";
	}

}
