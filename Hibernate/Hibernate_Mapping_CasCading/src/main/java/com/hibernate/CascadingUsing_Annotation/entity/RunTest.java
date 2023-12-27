package com.hibernate.CascadingUsing_Annotation.entity;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunTest {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("com/hibernate/configuration/hibernate.cfg.xml")
				.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

//		Create object
		Customer c1=new Customer("Chandan");
		
		Orders o1=new Orders(101);
		Orders o2=new Orders(102);
		Orders o3=new Orders(103);
		
		
//		Make a list of object due to many
		List<Orders> os1=new ArrayList<Orders>();
		os1.add(o1);
		os1.add(o2);
		os1.add(o3);

//		Mapping
		c1.setOrders(os1);
		
		o1.setCustomer(c1);
		o2.setCustomer(c1);
		o3.setCustomer(c1);
		
		// save to database
		session.save(c1);
		
		transaction.commit();

		// select the house by person id
//		Person person = session.get(Person.class, 1);
//		person.getHouse().forEach(e->{System.out.println("The p1 house is: " +e.getSname());});
//
//		// select the person by house id
//		House house = session.get(House.class, 1);
//		house.getPerson().forEach(e->{System.out.println("The Persons in H1 house are: " +e.getPname());});

		session.close();
		factory.close();
	}
}