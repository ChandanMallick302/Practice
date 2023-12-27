package com.hibernate.ManyToOne_And_OneToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunTest {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("com/hibernate/configuration/hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Electronics e1=new Electronics(101,"Mobile");
		Electronics e2=new Electronics(102,"TV");
		

		//mapping
		Brand b1=new Brand("Samsung",e1);
		Brand b2=new Brand("Motorola",e1);
		Brand b3=new Brand("Nokia",e1);
		Brand b4=new Brand("ONIDA",e1);
		
		List l=new ArrayList<>();
		l.add(b1);
		l.add(b2);
		l.add(b3);
		l.add(b4);
		
		e1.setBrand(l);
		
		//save to database
		session.save(e1);
		session.save(e2);
		session.save(b1);
		session.save(b2);
		session.save(b3);
		session.save(b4);
		
		
		transaction.commit();
		
		
		//select the Electronic by by brand id
		Brand b = session.get(Brand.class, 2);
		
		System.out.println(b.getElctronic().getName());
		
		
		session.close();
		factory.close();
	}
}