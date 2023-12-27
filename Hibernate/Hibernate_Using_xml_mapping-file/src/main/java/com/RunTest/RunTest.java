package com.RunTest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.pojoClass.Student;

public class RunTest {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		//Create Session-factory of the configuration file
		SessionFactory factory=new Configuration().configure("com/hibernateConfigurarion/hibernate.cfg.xml").buildSessionFactory();
		
		//open a session from session-factory
		Session session = factory.openSession();
		
		//Create Transaction from session
		Transaction tx=session.beginTransaction();
		
		//set the data to student object for saving into database
		Student s=new Student("Chandan");
		
		//save the data through student object in database using session
		session.save(s);
		
		//commit the transaction
		tx.commit();
		
		if(tx.isActive()) {
			System.out.println("Transaction failed");
		}
		else {
			System.out.println("Transaction successful");
		}
		
		//close the session
		session.close();
		factory.close();

	}

}
