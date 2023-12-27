package com.hinbernate.Dao.CRUD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hinbernate.Dao.EmployeeDao;
import com.hinbernate.Entity.Employee;

public class EmployeeDaoCRUD {
	private static SessionFactory factory = EmployeeDao.getSessionFactory();
	
	@SuppressWarnings("deprecation")
	public static boolean InsertintoEmployee(String fname,String lname) {
		boolean f=false;
		Session session = factory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		Employee e1=new Employee(fname,lname);
		
		session.save(e1);
		transaction.commit();
		session.close();
		f=true;
		return f;
	}
	
	public static Employee selectSpecificEmployee() {
		Session session = factory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		Employee e1 = session.get(Employee.class, 1);
		transaction.commit();
		session.close();
		return e1;
	}
	
	@SuppressWarnings({ "deprecation", "removal" })
	public static boolean updateSpecific(String fname,String lname) {
		boolean f=false;
		Session session = factory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
//		Employee e1 = session.load(Employee.class, new Integer(52));
//		e1.setFname(fname);
//		e1.setLname(lname);
		
		//or
		
		Employee e1=new Employee();
		e1.setId(52);
		e1.setFname(fname);
		e1.setLname(lname);
		session.update(e1);
		
		transaction.commit();
		session.close();
		f=true;
		return f;
	}
	@SuppressWarnings("deprecation")
	public static boolean deleteSpecific(int id) {
		boolean f=false;
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Employee e1=new Employee(id);
		
		session.delete(e1);
		transaction.commit();
		session.close();
		f=true;
		return f;
	}
}
