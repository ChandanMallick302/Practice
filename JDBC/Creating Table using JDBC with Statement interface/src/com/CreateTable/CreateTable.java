package com.CreateTable;

import java.sql.Connection;
import java.sql.Statement;

import com.databaseConnection.DatabaseConnection;

public class CreateTable {
	
	private Connection con;

	public CreateTable() throws Exception {

		try {
			// Fire Query
			DatabaseConnection db1 = new DatabaseConnection();
			this.con = db1.getConnection();
			Statement stmt = con.createStatement();
			stmt.execute("Create Table student(id int,name varchar(200))");
			System.out.println("Table Created sucessfully");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.con.close();
		}
	}

	public static void main(String[] args) {
		try {
			new CreateTable();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}