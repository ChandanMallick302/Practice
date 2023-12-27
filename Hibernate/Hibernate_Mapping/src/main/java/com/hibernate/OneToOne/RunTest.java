package com.hibernate.OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunTest {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("com/hibernate/configuration/hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		Team t1=new Team(2,"India");

		//mapping
		Player p1=new Player("Chandan",t1);
		
		//save to database
		session.save(p1);
		session.save(t1);
		
		
		transaction.commit();
		
		
		//select the team by person id
		Player player = session.get(Player.class, 1);
		
		System.out.println(player.getTeam().getTeam_name());
		
		
		session.close();
		factory.close();
	}
}