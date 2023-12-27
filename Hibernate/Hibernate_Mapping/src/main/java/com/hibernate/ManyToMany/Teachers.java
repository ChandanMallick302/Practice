package com.hibernate.ManyToMany;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
@Entity
public class Teachers {

	@Id
	@GeneratedValue
	private int tid;

	private String tname;
	@ManyToMany
	private List<Subjects> subject;

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public List<Subjects> getSubject() {
		return subject;
	}

	public void setSubject(List<Subjects> subject) {
		this.subject = subject;
	}

	public Teachers() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teachers(int tid, String tname, List<Subjects> subject) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.subject = subject;
	}

	
	public Teachers(String tname) {
		super();
		this.tname = tname;
	}

	@Override
	public String toString() {
		return "Teachers [tid=" + tid + ", tname=" + tname + ", subject=" + subject + "]";
	}

}
