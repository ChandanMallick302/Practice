package com.hibernate.pojoClass;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity(name = "player")
public class Player {

	@Id
	private int id;

	private int age;

	private String name;

	@OneToOne
	private Team team;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Team getteam() {
		return team;
	}

	public void setteam(Team team) {
		this.team = team;
	}

	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Player(int id, int age, String name, Team team) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.team = team;
	}

	public Player(int age, String name, Team team) {
		super();
		this.age = age;
		this.name = name;
		this.team = team;
	}
	
	@Override
	public String toString() {
		return "Player [id=" + id + ", age=" + age + ", name=" + name + ", team=" + team + "]";
	}
}