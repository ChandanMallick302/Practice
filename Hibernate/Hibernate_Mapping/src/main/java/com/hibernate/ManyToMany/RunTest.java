package com.hibernate.ManyToMany;

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
		
		
		//create object and set data
		Teachers t1=new Teachers("Chandan");
		
		Subjects s1=new Subjects("English");
		Subjects s2=new Subjects("Math");
		
		Teachers t2=new Teachers("Rajesh");
		
		Subjects s3=new Subjects("Science");
		Subjects s4=new Subjects("History");
		
		
		List l1=new ArrayList<>();
		l1.add(s1);
		l1.add(s2);
		
		List l2=new ArrayList<>();
		l2.add(s3);
		l2.add(s4);
		
		//mapping
		t1.setSubject(l1);
		t2.setSubject(l2);
		
		s1.setTeachers(t1);
		s2.setTeachers(t1);
		s3.setTeachers(t2);
		s4.setTeachers(t2);
		
		//save to database
		session.save(t1);
		session.save(t2);
		session.save(s1);
		session.save(s2);
		session.save(s3);
		session.save(s4);
		
		transaction.commit();
		
		
		//select the Electronic by by brand id
		Subjects b = session.get(Subjects.class, 1);
		
		System.out.println(b.getTeachers().getTname());
		
		
		session.close();
		factory.close();
	}
}