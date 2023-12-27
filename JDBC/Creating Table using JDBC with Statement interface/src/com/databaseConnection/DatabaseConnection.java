package com.databaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

	private Connection con;

	public void setConnection(Connection con) {
		this.con = con;
	}

	public Connection getConnection() {
		return con;
	}

	public DatabaseConnection()throws Exception {
		try {
			// load the driver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// create connection
			String url = "jdbc:mysql://localhost:3306/mydb";
			String user = "root";
			String password = "root";
			this.con = DriverManager.getConnection(url, user, password);
			if (con.isClosed()) {
				System.out.println("Databse connection is closed");
			} else {
				System.out.println("Connection is sucessfully established");
			}
		} catch (Exception e) {
			System.out.println("Database connection failed");
		}
	}
}
