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
		Transaction transaction = session.beginTransaction();

//		Create object for Question
		Question q1 = new Question("What is Java?");
		Question q2 = new Question("What is Python?");

//		Create object for Answer
		Answer a1 = new Answer("Java is a programing language.", q1);
		Answer a2 = new Answer("Java is a programing language.", q2);

		q1.setAnswer(a1);
		q2.setAnswer(a2);

		// save to database
		session.save(q1);
		session.save(q2);
		session.save(a1);
		session.save(a2);

		transaction.commit();

		// select the Answer by question id
		Question question = session.get(Question.class, 1);
		System.out.println("The Answer is: "+question.getAnswer().getAnswer());

		// select the Answer by question id
		Answer answer = session.get(Answer.class, 1);
		System.out.println("The Question is: "+answer.getQuestion().getQuestion());

		session.close();
		factory.close();
	}
}