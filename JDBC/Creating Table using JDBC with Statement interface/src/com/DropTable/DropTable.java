package com.DropTable;

import java.sql.Connection;
import java.sql.Statement;

import com.databaseConnection.DatabaseConnection;

public class DropTable {

	private Connection con;

	public DropTable() throws Exception {
		try {
			DatabaseConnection db = new DatabaseConnection();
			this.con = db.getConnection();
			Statement stmt = con.createStatement();

			stmt.execute("Drop table teacher");
			System.out.println("Table is sucessfully dropped");
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			this.con.close();
		}
	}

	public static void main(String[] args) {
		try {
			new DropTable();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
