package com.hibernate.RunTest;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.pojoClass.Certificate;
import com.hibernate.pojoClass.Students;

public class RunTest {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		try {
			SessionFactory factory = new Configuration().configure("com/hibernate/Configuration/hibernate.cfg.xml")
					.buildSessionFactory();
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();

			Certificate c1 = new Certificate("java", "3 Months");
			Certificate c2 = new Certificate("Python", "2 Months");

			Students s1 = new Students("Chandan", "Balsore", c1);
			Students s2 = new Students("Rajesh", "Bhadrakh", c2);

			session.save(s1);
			session.save(s2);

			transaction.commit();

			if (s1.equals(null) && c1.equals(null)) {
				System.out.println("inserttion failed");
			} else {
				System.out.println("Successfully inserted");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
