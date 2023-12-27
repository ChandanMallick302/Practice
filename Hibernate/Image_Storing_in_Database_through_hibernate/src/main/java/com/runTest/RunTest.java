package com.runTest;

import java.io.File;
import java.io.FileInputStream;

import javax.swing.JFileChooser;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.pojoClass.Image;

public class RunTest {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		try {
			SessionFactory factory = new Configuration().configure("com/hibernate/Configuration/hibernate.cfg.xml").buildSessionFactory();
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			
			//setting for image
			JFileChooser jfc=new JFileChooser();
			jfc.showOpenDialog(null);
			File file=jfc.getSelectedFile();
			FileInputStream fis=new FileInputStream(file);
			
			byte[] data=new byte[fis.available()];
			fis.read(data);
			
			Image i=new Image("Rama.jpg",data);
			session.save(i);
			transaction.commit();
			
			if(i.equals(null)) {
				System.out.println("Images is Failed to insert");
				fis.close();
				session.close();
				factory.close();
			}
			else {
				System.out.println("Image is successfully inserted");
				fis.close();
				session.close();
				factory.close();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}
