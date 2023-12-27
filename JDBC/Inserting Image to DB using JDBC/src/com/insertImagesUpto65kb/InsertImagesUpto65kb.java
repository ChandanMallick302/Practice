package com.insertImagesUpto65kb;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;

import com.databaseConnection.DatabaseConnection;

public class InsertImagesUpto65kb {
	private Connection con;
	public void InsertOne()throws Exception {
		try {
			DatabaseConnection db=new DatabaseConnection();
			this.con = db.getConnection();
			PreparedStatement pstmt = con.prepareStatement("insert into images (pic) values(?)");
			
			FileInputStream fis=new FileInputStream("src/com/insertImagesUpto65kb/download.jpg");
			
			pstmt.setBinaryStream(1,fis,fis.available());
			
			int inserImage = pstmt.executeUpdate();
			
			if(inserImage>0) {
				System.out.println("image inserted into database");
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
		InsertImagesUpto65kb i = new InsertImagesUpto65kb();
		i.InsertOne();
	}
}
