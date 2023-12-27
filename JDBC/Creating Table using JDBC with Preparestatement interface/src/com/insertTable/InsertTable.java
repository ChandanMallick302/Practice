package com.insertTable;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import com.databaseconnection.Databaseconnection;

public class InsertTable {

	private Connection con;
	public void InsertMany()throws Exception {
		try {
			Databaseconnection db=new Databaseconnection();
			this.con = db.getConnection();
			PreparedStatement pstmt = con.prepareStatement("insert into teacher(id,name)values(?,?)");
			
			int id[]= {1,2,3};
			String name[]= {"Chandan","Ramesh","Rajesh"};
			
			
			
			int inserTable=0;
			for(int i=0;i<=(id.length-1);i++) {
				pstmt.setInt(1, id[i]);
				pstmt.setString(2, name[i]);
				inserTable = pstmt.executeUpdate();
			}
			
			if(inserTable>0) {
				System.out.println("data inserted");
			}
			else {
				System.out.println("Data insertion failed");
			}
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}finally {
			con.close();
		}
	}
	public void InsertOne()throws Exception {
		try {
			Databaseconnection db=new Databaseconnection();
			this.con = db.getConnection();
			PreparedStatement pstmt = con.prepareStatement("insert into teacher(id,name)values(?,?)");
			
			
			pstmt.setInt(1, 2);
			pstmt.setString(2, "Rajesh");
			
			int inserTable = pstmt.executeUpdate();
			
			if(inserTable>0) {
				System.out.println("data inserted");
			}
			else {
				System.out.println("Data insertion failed");
			}
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}finally {
			con.close();
		}
	}
	
	public static void main(String[] args) throws Exception {
		InsertTable i = new InsertTable();
//		i.InsertOne();
		i.InsertMany();
	}
}