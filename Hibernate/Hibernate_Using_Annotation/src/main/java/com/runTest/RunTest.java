package com.runTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Date;

import javax.swing.JFileChooser;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.pojoClass.Teacher;

public class RunTest {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		try {
			SessionFactory factory = new Configuration().configure("com/hibernate/Configuration/hibernate.cfg.xml").buildSessionFactory();
			Session session = factory.openSession();
			Transaction tx = session.beginTransaction();
			
//		set the imaage file by choosing
			JFileChooser jfc=new JFileChooser();
			jfc.showOpenDialog(null);
			File file = jfc.getSelectedFile();
			InputStream fis=new FileInputStream(file);
			
			byte[] data=new byte[fis.available()];
			fis.read(data);
			
			Teacher t1=new Teacher();
			
			t1.setFname("Chandan");
			t1.setLname("Mallick");
			t1.setRoll("Math Teacher");
			t1.setImages(data);
			t1.setDate(new Date());
			session.save(t1);
			
			tx.commit();
			
			session.close();
			factory.close();
			fis.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}
