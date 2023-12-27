package com.InsertTable;

import java.sql.Connection;
import java.sql.Statement;

import com.databaseConnection.DatabaseConnection;

public class InsertIData_IntoTable {

	private Connection con;
	public InsertIData_IntoTable() throws Exception {
		try {
			DatabaseConnection db = new DatabaseConnection();
			this.con = db.getConnection();
			Statement stmt = con.createStatement();
			int insertTable = stmt.executeUpdate("insert into student value(1,'Chandan'),(2,'Rajesh')");
			if(insertTable>0) {
				System.out.println("Data inseted");
			}
			else {
				System.out.println("insertion failed");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			this.con.close();
		}
	}

	public static void main(String[] args) {
		try {
			new InsertIData_IntoTable();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
