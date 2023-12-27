package com.hibernate.RunTest;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Subjects;
import com.hibernate.entity.Topics;

public class RunTest {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("com/hibernate/configuration/hibernate.cfg.xml")
				.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

//		Create object for Topics
		Topics t1 = new Topics("Variables");
		Topics t2 = new Topics("Constructor");
		Topics t3 = new Topics("OOPS");

//		Make a list of object due to many
		List<Topics> t = new ArrayList<Topics>();
		t.add(t1);
		t.add(t2);
		t.add(t3);

//		Create object for Subjects
		Subjects s1 = new Subjects("java", t);
		Subjects s2 = new Subjects("python", t);
		
		t1.setSubjects(s1);
		t2.setSubjects(s1);
		t3.setSubjects(s1);
		
		t1.setSubjects(s2);
		t2.setSubjects(s2);
		t3.setSubjects(s2);

		// save to database
		session.save(t1);
		session.save(t2);
		session.save(t3);
		session.save(s1);
		session.save(s2);
		
		transaction.commit();

		// select the Answer by question id
//		Subjects subjects = session.get(Subjects.class, 2);
//		List<Topics> Sub = subjects.getTopics();
//		System.out.println("sasas");
//		for(Topics s:Sub) {
//			System.out.println(s.getTname());
//		}

		// select the Answer by question id
//		Topics topics = session.get(Topics.class, 1);
//		System.out.println("The Question is: " + topics.getSubjects().getSname());

		session.close();
		factory.close();
	}
}