package com.hibernate.ManyToAny;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.ManyToOne_And_OneToMany.Brand;

public class RunTest {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("com/hibernate/configuration/hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Electronicss e1=new Electronicss(101,"Mobile1");
		Electronicss e2=new Electronicss(102,"Mobile2");
		
		
		Brands1 b1=new Brands1("Samsung",e1);
		Brands1 b2=new Brands1("Motorola",e2);
		Brands1 b3=new Brands1("Nokia",e1);
		Brands1 b4=new Brands1("mi",e2);
		
		
		List l=new ArrayList<>();
		l.add(b1);
		l.add(b3);
		
		List l2=new ArrayList<>();
		l2.add(b2);
		l2.add(b4);
		
		
		//mapping
		e1.setBrand(l);
		e2.setBrand(l2);
		
		
		//save to database
//		session.save(e1);
//		session.save(e2);
//		session.save(b1);
//		session.save(b2);
//		session.save(b3);
//		session.save(b4);
		
		
//		transaction.commit();
		
		
//      Select the Electronic by by brand id
		
		Brands1 b = session.get(Brands1.class, 1);
		System.out.println(b.getElctronic().getName());
		
		
		session.close();
		factory.close();
	}
}