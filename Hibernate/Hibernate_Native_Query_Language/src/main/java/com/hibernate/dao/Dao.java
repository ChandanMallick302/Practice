package com.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Dao {

	private static SessionFactory factory = new Configuration()
			.configure("com/hibernate/Configuration/hibernate.cfg.xml").buildSessionFactory();

	public static Session openSession() {
		Session session = factory.openSession();
		return session;
	}

	public static boolean shutdownSession() {
		boolean f = false;
		Dao.openSession().close();
		factory.close();
		f = true;
		return f;
	}
}