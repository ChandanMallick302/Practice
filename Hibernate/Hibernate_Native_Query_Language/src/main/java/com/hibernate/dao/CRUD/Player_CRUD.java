package com.hibernate.dao.CRUD;

import java.util.Arrays;
import java.util.List;

import org.hibernate.*;
import org.hibernate.query.NativeQuery;

import com.hibernate.dao.Dao;
import com.hibernate.pojoClass.Player;

public class Player_CRUD {

	@SuppressWarnings("deprecation")
	public static void selectAllPlayer() {
		Session session = Dao.openSession();

		String q = "select * from player";
		NativeQuery query = session.createNativeQuery(q);
		
		List<Object[]> list = query.list();
		list.forEach(e->{System.out.println(Arrays.toString(e));});
		Dao.shutdownSession();
	}
	
	public static boolean insertPlayer(int id,int age,String name) {
		Session session = Dao.openSession();
		Transaction transaction = session.beginTransaction();
		boolean f=false;
		String q = "insert into player (id,age,name) values (?,?,?)";
		NativeQuery query = session.createNativeQuery(q);
		query.setParameter(1, id);
		query.setParameter(2, age);
		query.setParameter(3, name);
		int save = query.executeUpdate();
		if(save>0) {
			System.out.println("Sucessfully saved");
		}else {
			System.out.println("failed to save data");
		}
		transaction.commit();
		Dao.shutdownSession();
		f=true;
		return f;
	}
}