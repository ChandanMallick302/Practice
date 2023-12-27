package com.hibernate.OneToOne;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "player")
public class Player {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String name;

	@OneToOne
	private Team team;

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

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Player(int id, String name, Team team) {
		super();
		this.id = id;
		this.name = name;
		this.team = team;
	}

	public Player(String name, Team team) {
		super();
		this.name = name;
		this.team = team;
	}

	public Player(String name) {
		super();
		this.name = name;
	}

	public Player(Team team) {
		super();
		this.team = team;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", team=" + team + "]";
	}

}
