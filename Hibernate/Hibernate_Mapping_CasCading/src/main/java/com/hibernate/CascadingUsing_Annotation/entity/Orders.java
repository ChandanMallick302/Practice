package com.hibernate.CascadingUsing_Annotation.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Entity
@Table(name="orders")
@Data
public class Orders {

	@Id
	@Column(name = "order_id")
	private int id;
	@ManyToOne
	@JoinColumn(name = "customer")
	private Customer customer;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date date;
	
	public Orders(){
		super();
	}
	public Orders(int id) {
		super();
		this.id=id;
	}
}