package com.deleteTable;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.databaseconnection.Databaseconnection;

public class DeleteTable {

	private Connection con;

	public void deleteAll() throws Exception {
		try {
			Databaseconnection db = new Databaseconnection();
			this.con = db.getConnection();
			PreparedStatement pstmt = con.prepareStatement("delete from teacher");
			int delete = pstmt.executeUpdate();
			if (delete > 0) {
				System.out.println("Sucessfully All deleted");
			} else {
				System.out.println("Deletion failed");
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		} finally {
			con.close();
		}
	}

	public void deleteSpecific() throws Exception {
		try {
			Databaseconnection db = new Databaseconnection();
			this.con = db.getConnection();
			PreparedStatement pstmt = con.prepareStatement("delete from teacher where id=?");
			
			pstmt.setInt(1, 2);
			int delete = pstmt.executeUpdate();
			if (delete > 0) {
				System.out.println("Sucessfully deleted");
			} else {
				System.out.println("Deletion failed");
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		} finally {
			con.close();
		}
	}
	public static void main(String[] args) throws Exception {
		DeleteTable s1 = new DeleteTable();
//		s1.deleteAll();
		s1.deleteSpecific();
	}

}
