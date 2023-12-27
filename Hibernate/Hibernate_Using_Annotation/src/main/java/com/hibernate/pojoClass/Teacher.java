package com.hibernate.pojoClass;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Transient;

//Entity is declare to make this class an object for the database
@Entity

// By default hibernate will name the table Teacher as class name but @Table annotation override it to Teacher
@Table(name = "Teacher")
public class Teacher {

	// @id make address_id as a primary key and @GeneratedValue
	// auto increment
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "tid")
	private int id;

	// This will override and make column naming & set length 50 in
	// place of street
	@Column(name = "first_name", length = 50, nullable = true)
	private String fname;

	// This will override and make column name City in
	// place of City
	@Column(name = "last_name")
	private String lname;

	// This will not create column name x in database
	@Transient
	private String roll;

	// This will override and make column name date with specific Date format
	@Temporal(TemporalType.DATE)
	private Date date;

//    //Lob to tell hibernate that image’s a large object and is not a simple object
	@Lob
	@Column(name = "image", columnDefinition = "LONGBLOB")
	private byte[] images;

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(int id, String fname, String lname, String roll, Date date, byte[] images) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.roll = roll;
		this.date = date;
		this.images = images;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getRoll() {
		return roll;
	}

	public void setRoll(String roll) {
		this.roll = roll;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public byte[] getImages() {
		return images;
	}

	public void setImages(byte[] images) {
		this.images = images;
	}
}
