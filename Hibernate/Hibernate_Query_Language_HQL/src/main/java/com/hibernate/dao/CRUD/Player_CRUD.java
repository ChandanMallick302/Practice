package com.hibernate.dao.CRUD;

import java.util.Arrays;
import java.util.List;

import org.hibernate.*;
import org.hibernate.Session.*;
import org.hibernate.query.*;

import com.hibernate.dao.Dao;
import com.hibernate.pojoClass.Player;
import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;

public class Player_CRUD {

	public static void selectAllPlayer() {
		Session session = Dao.openSession();

		String q = "from player";
		@SuppressWarnings("deprecation")
		Query query = session.createQuery(q);
		List<Player> playerList = query.list();

		playerList.forEach(e -> {
			System.out.println(e);
		});
		Dao.shutdownSession();
	}

	@SuppressWarnings("deprecation")
	public static void selectPlayerById(int parameter_name) {
		Session session = Dao.openSession();
		Transaction transaction = session.beginTransaction();

		String q = "from player where id=:id";
		Query query = session.createQuery(q);
		query.setParameter("id", parameter_name);
		List<Player> list = query.list();

		list.forEach(e -> {
			System.out.println(e);
		});
		transaction.commit();
		Dao.shutdownSession();
	}

	public static void selectPlayersNameListByAge(int age1, int age2) {
		Session session = Dao.openSession();

		String q = "from player where age between :age1 and :age2";
		Query query = session.createQuery(q);
		query.setParameter("age1", age1);
		query.setParameter("age2", age2);

		List<Player> playersName = query.list();
		playersName.forEach(e -> {
			System.out.println(e);
		});

		Dao.shutdownSession();
	}

	@SuppressWarnings("deprecation")
	public static void selectPlayerNameInAscending() {
		Session session = Dao.openSession();
		
		String q="from player order by name asc";
		Query query = session.createQuery(q);
		List<Player> list = query.list();
		
		list.forEach(e->{System.out.println(e);});
		
		Dao.shutdownSession();
		
	}
	
	public static boolean deletePlayerSpecific(String name) {
		boolean f=false;
		
		Session session = Dao.openSession();
		Transaction transaction = session.beginTransaction();
		
		String q="delete from player as p where p.name=:x";
		Query query = session.createQuery(q);
		query.setParameter("x", name);
		query.executeUpdate();
		System.out.println("Sucessfully deleted");
		transaction.commit();
		Dao.shutdownSession();
		f=true;
		return f;
	}
	@SuppressWarnings("deprecation")
	public static boolean deleteAllPlayer() {
		boolean f=false;
		
		Session session = Dao.openSession();
		Transaction transaction = session.beginTransaction();
		
		String q="delete from player";
		Query query = session.createQuery(q);
		query.executeUpdate();
		System.out.println("Sucessfully deleted");
		transaction.commit();
		Dao.shutdownSession();
		f=true;
		return f;
	}
	public static boolean updatePlayerSpecific(String x,String y) {
		boolean f=false;
		
		Session session = Dao.openSession();
		Transaction transaction = session.beginTransaction();
		
		String q="update player as p set p.name=:x where p.name=:y";
		Query query = session.createQuery(q);
		query.setParameter("x", x);
		query.setParameter("y", y);
		int executeUpdate = query.executeUpdate();
		System.out.println(+executeUpdate+" Data Sucessfully updated");
		transaction.commit();
		Dao.shutdownSession();
		f=true;
		return f;
	}
	
	@SuppressWarnings("deprecation")
	public static boolean updateAllPlayer(String x) {
		boolean f=false;
		
		Session session = Dao.openSession();
		Transaction transaction = session.beginTransaction();
		
		String q="update player as p set p.name=:x";
		Query query = session.createQuery(q);
		query.setParameter("x", x);
		int executeUpdate = query.executeUpdate();
		System.out.println(+executeUpdate+" Data Sucessfully updated");
		transaction.commit();
		Dao.shutdownSession();
		f=true;
		return f;
	}
	
	// select with join query
	@SuppressWarnings("deprecation")
	public static void selectTwotableData() {
		
		Session session = Dao.openSession();
		
		String q="select (p.name,t.tname) from player as p INNER JOIN p.team as t";
		Query query = session.createQuery(q);
		List<Object[]> resultList = query.getResultList();
		for(Object[] arr:resultList) {
			System.out.println(Arrays.toString(arr));
		}
		Dao.shutdownSession();
	}
	@SuppressWarnings("deprecation")
	public static void Implementing_Pagination() {
		Session session = Dao.openSession();
		
		String s="from player";
		Query query = session.createQuery(s);
		
		//Implementing_Pagination using hibernate
		//from
		query.setFirstResult(1);
		//to
		query.setMaxResults(2);
		
		List<Player> list = query.list();
		list.forEach(e->{System.out.println(e.getId()+" "+e.getName());});
		
		Dao.shutdownSession();
	}
}