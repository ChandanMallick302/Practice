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
		Question q1 = new Question();

//		Create object for Answer 
		Answer a1 = new Answer();

		//Question and Answer :Transient State
		q1.setQuestion("Full form of OS?");
		a1.setAnswer("Operating System");
		
		// save to database :
		session.persist(q1);
		session.save(a1);
		System.out.println("Sucessfully saved");
		
		//Answer and question -session,database :Persistent State
		a1.setAnswer("dsd3232sds");
		q1.setQuestion("ds3232adsa");
		System.out.println("Sucessfully updated");
		
		//Removed from session and database without saving :Remove State
		session.remove(a1);
		session.remove(q1);
		System.out.println("Sucessfully removed without saving data");
		
		transaction.commit();
		
		
		session.close();
		//After close or clear session object :Detached State
		
		// this will not save because of detach
		a1.setAnswer("Operating Sysgdfgtem");

		
		factory.close();
	}
}