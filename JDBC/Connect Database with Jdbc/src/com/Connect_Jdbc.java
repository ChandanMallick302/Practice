package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Connect_Jdbc {

	public static void main(String[] args) throws Exception {
		try {
//		Load Diver
			Class.forName("com.mysql.cj.jdbc.Driver");

			// Create Connection
			String url = "jdbc:mysql://localhost:3306/paper";
			String username = "root";
			String password = "root";
			Connection con = DriverManager.getConnection(url, username, password);
			
			if(con.getAutoCommit()) {
				System.out.println("Connection is sucessfully established");
			}
			else {
				System.out.println("Connection Failed Please check the url,driver class name and user name password");
			}
			
			//create query
			String sql="select * from students";
			Statement stmt = con.createStatement();
			stmt.execute(sql);
			ResultSet set = stmt.getResultSet();
			
			//Process Data
			while (set.next()) {
				int id = set.getInt("id");
				String name=set.getString("name");
				System.out.println(id+" "+name);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}