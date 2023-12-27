package com.hibernate.pojoClass;

import java.util.Arrays;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name = "ImageTable")
public class Image {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "image_id", columnDefinition = "INTEGER", nullable = false)
	private int id;

	@Column(name = "image_name", columnDefinition = "VARCHAR(200)")
	private String name;
	@Lob
	@Column(name = "image_Location", columnDefinition = "LONGBLoB")
	private byte[] image;

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

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public Image() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Image(int id, String name, byte[] image) {
		super();
		this.id = id;
		this.name = name;
		this.image = image;
	}

	public Image(String name, byte[] image) {
		super();
		this.name = name;
		this.image = image;
	}

	@Override
	public String toString() {
		return "Image [id=" + id + ", name=" + name + ", image=" + Arrays.toString(image) + "]";
	}

}
