package com.SelectTable;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.databaseConnection.DatabaseConnection;

public class SelectTable {
	private Connection con;

	public void selectAll() throws Exception {
		try {
			DatabaseConnection db = new DatabaseConnection();
			this.con = db.getConnection();
			Statement stmt = con.createStatement();
			
			ResultSet set = stmt.executeQuery("select * from student");
			while(set.next()) {
				int id = set.getInt(1);
				String name = set.getString(2);
				System.out.println(id+" "+name);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.con.close();
		}
	}
	
	public void selectSpecific() throws Exception {
		try {
			DatabaseConnection db = new DatabaseConnection();
			this.con = db.getConnection();
			Statement stmt = con.createStatement();
			
			ResultSet set = stmt.executeQuery("select * from student where id=1");
			while(set.next()) {
				int id = set.getInt(1);
				String name = set.getString(2);
				System.out.println(id+" "+name);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.con.close();
		}
	}
	public static void main(String[] args) throws Exception {
		SelectTable s1 = new SelectTable();
		s1.selectAll();
		s1.selectSpecific();
	}
}
