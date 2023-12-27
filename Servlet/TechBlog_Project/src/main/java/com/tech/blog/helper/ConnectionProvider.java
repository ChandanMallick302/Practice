package com.tech.blog.helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ConnectionProvider {

	private static Connection con;

	public static Connection getConnection() {
		try {
			if (con == null) {
				// load the driver
				Class.forName("com.mysql.cj.jdbc.Driver");

				// create a connection
				String url = "jdbc:mysql://localhost:3306/techblog";
				String user = "root";
				String password = "root";
				con = DriverManager.getConnection(url, user, password);
//				PreparedStatement pstmt = con.prepareStatement("select * from teacher");
//				ResultSet set = pstmt.executeQuery();
//				while (set.next()) {
//					System.out.println(set.getInt(1));
//					System.out.println(set.getString(2));
//				}
				if (con.isClosed()) {
					System.out.println("Connection is closed");
				} else {
					System.out.println("Connection is successdully established");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return con;
	}

	public static void main(String[] args) throws Exception {
		ConnectionProvider.getConnection();
	}
}