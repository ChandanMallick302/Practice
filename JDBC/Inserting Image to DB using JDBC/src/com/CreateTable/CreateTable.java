package com.CreateTable;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.databaseConnection.DatabaseConnection;

public class CreateTable {

	private Connection con;

	public CreateTable() throws Exception {
		try {
			DatabaseConnection db = new DatabaseConnection();
			this.con = db.getConnection();
			String Table_name = "images";
			PreparedStatement pstmt = this.con.prepareStatement("Create table "+Table_name+" (id int AUTO_INCREMENT,pic blob,primary key(id))");

			int createTable = pstmt.executeUpdate();

			if (createTable > -1) {
				System.out.println(Table_name + " table is created successfully");
			} else {
				System.out.println("Table creation failed");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			this.con.close();
		}
	}

	public static void main(String[] args) throws Exception {
		new CreateTable();
	}
}
