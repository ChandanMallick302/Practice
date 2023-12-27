package com.hibernate.OneToOne;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "team")
public class Team {

	@Id
	private int id;
	private String team_name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTeam_name() {
		return team_name;
	}

	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}

	public Team() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Team(int id, String team_name) {
		super();
		this.id = id;
		this.team_name = team_name;
	}

	@Override
	public String toString() {
		return "Team [id=" + id + ", team_name=" + team_name + "]";
	}

}
