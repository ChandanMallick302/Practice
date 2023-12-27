package com.selectTable;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.databaseconnection.Databaseconnection;

public class SelectTable {

	private Connection con;

	public void selectAll() throws Exception {
		try {
			Databaseconnection db = new Databaseconnection();
			this.con = db.getConnection();
			PreparedStatement pstmt = con.prepareStatement("Select * from teacher");
			ResultSet set = pstmt.executeQuery();
			while (set.next()) {
				System.out.print(set.getInt(1)+" ");
				System.out.println(set.getString(2));
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		} finally {
			con.close();
		}
	}
	public void selectSpecific() throws Exception {
		try {
			Databaseconnection db = new Databaseconnection();
			this.con = db.getConnection();
			PreparedStatement pstmt = con.prepareStatement("Select * from teacher where id=?");
			
			pstmt.setInt(1, 3);
			ResultSet set = pstmt.executeQuery();
			while (set.next()) {
				System.out.print(set.getInt(1)+" ");
				System.out.println(set.getString(2));
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		} finally {
			con.close();
		}
	}
	public static void main(String[] args) throws Exception {
		SelectTable s1 = new SelectTable();
//		s1.selectAll();
		s1.selectSpecific();
	}

}
