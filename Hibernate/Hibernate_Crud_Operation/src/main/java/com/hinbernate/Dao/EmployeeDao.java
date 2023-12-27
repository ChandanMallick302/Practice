package com.hinbernate.Dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmployeeDao {

	private static SessionFactory factory;

	public static SessionFactory getSessionFactory() {
		factory = new Configuration().configure("com/hibernate/Configuration/hibernate.cfg.xml").buildSessionFactory();
		return factory;
	}

	public static SessionFactory shutdownSessionFactory() {
		
		factory.close();
		return factory;
	}
}
