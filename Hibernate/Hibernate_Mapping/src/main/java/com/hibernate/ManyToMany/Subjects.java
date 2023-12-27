package com.hibernate.ManyToMany;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Subjects")
public class Subjects {

	@Id
	@GeneratedValue
	private int sid;
	private String sname;
	@ManyToOne
	private Teachers teachers;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Teachers getTeachers() {
		return teachers;
	}

	public void setTeachers(Teachers teachers) {
		this.teachers = teachers;
	}

	public Subjects(int sid, String sname, Teachers teachers) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.teachers = teachers;
	}

	public Subjects(String sname, Teachers teachers) {
		super();
		this.sname = sname;
		this.teachers = teachers;
	}

	public Subjects() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Subjects(String sname) {
		super();
		this.sname = sname;
	}

	@Override
	public String toString() {
		return "Subjects [sid=" + sid + ", sname=" + sname + ", teachers=" + teachers + "]";
	}
}