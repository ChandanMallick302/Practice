package com.hibernate.RunTest;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.EAGER_Loading.House;
import com.hibernate.entity.EAGER_Loading.Person;
import com.hibernate.entity.LAZY_Loading.House1;

public class RunTest {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("com/hibernate/configuration/hibernate.cfg.xml")
				.buildSessionFactory();
		Session session = factory.openSession();

		// select the house by person id in lazy loading
		House1 house1 = session.get(House1.class, 1);
		System.out.println("house id: " + house1.getId());
		System.out.println("Person size: " + house1.getPerson().size());

		// select the house by person id in lazy loading
		House house = session.get(House.class, 2);
		System.out.println("house id: " + house.getId());

		session.close();
		factory.close();
	}
}