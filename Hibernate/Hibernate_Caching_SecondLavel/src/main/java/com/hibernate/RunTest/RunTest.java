package com.hibernate.RunTest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Question;


public class RunTest {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("com/hibernate/configuration/hibernate.cfg.xml")
				.buildSessionFactory();
		Session session = factory.openSession();
		
		// select the Answer by question id
		Question question1 = session.get(Question.class, 1);
		System.out.println("Question :"+question1.getQuestion());
		
		session.evict(question1);	
		//second level caching
		System.out.println("is Question is present in session1 object : "+session.contains(question1));
		
		Session session2 = factory.openSession();
		Question question2 = session.get(Question.class, 1);
		System.out.println("Answer : "+question2.getId());
		session2.close();
		factory.close();
	}
}