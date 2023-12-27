package com.hibernate.RunTest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.Answer;
import com.hibernate.entity.Question;

public class RunTest {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("com/hibernate/configuration/hibernate.cfg.xml")
				.buildSessionFactory();
		Session session = factory.openSession();
		
		// select the Answer by question id
		Question question1 = session.get(Question.class, 52);
		System.out.println("Question :"+question1.getQuestion());
		
		System.out.println("is Question is present in session object : "+session.contains(question1));
		
		Question question2 = session.get(Question.class, 52);
		System.out.println("Answer : "+question2.getAnswer().getAnswer());

		
		session.close();
		factory.close();
	}
}