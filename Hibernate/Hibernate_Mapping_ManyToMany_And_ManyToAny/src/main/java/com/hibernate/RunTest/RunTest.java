package com.hibernate.RunTest;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.entity.House;
import com.hibernate.entity.Person;

public class RunTest {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("com/hibernate/configuration/hibernate.cfg.xml")
				.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

//		Create object
		House h1=new House("A1");
		House h2=new House("B1");
		
		Person p1=new Person("P1");
		Person p2=new Person("P2");
		Person p3=new Person("P3");
		Person p4=new Person("P4");
		
//		Make a list of object due to many
		List<House> hl1 = new ArrayList<House>();
		hl1.add(h1);
		
		List<House> hl2 = new ArrayList<House>();
		hl2.add(h2);
		
		List<Person> pl1 = new ArrayList<Person>();
		pl1.add(p1);
		pl1.add(p2);
		
		List<Person> pl2 = new ArrayList<Person>();
		pl2.add(p3);
		pl2.add(p4);

//		Mapping
		h1.setPerson(pl1);
		h2.setPerson(pl2);
		
		p1.setHouse(hl1);
		p2.setHouse(hl1);
		p3.setHouse(hl2);
		p4.setHouse(hl2);
		
		// save to database
		session.save(p1);
		session.save(p2);
		session.save(p3);
		session.save(p4);
		session.save(h1);
		session.save(h2);
		
		transaction.commit();

		// select the house by person id
		Person person = session.get(Person.class, 1);
		person.getHouse().forEach(e->{System.out.println("The p1 house is: " +e.getSname());});

		// select the person by house id
		House house = session.get(House.class, 1);
		house.getPerson().forEach(e->{System.out.println("The Persons in H1 house are: " +e.getPname());});

		session.close();
		factory.close();
	}
}