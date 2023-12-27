package com.insertImagesAbove65Kb;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.swing.JFileChooser;

import com.databaseConnection.DatabaseConnection;

public class InsertImagesAbove65kb {
	private Connection con;
	private PreparedStatement pstmt;
	public void InsertOne()throws Exception {
		try {
			DatabaseConnection db=new DatabaseConnection();
			this.con = db.getConnection();
			this.pstmt = con.prepareStatement("alter table images modify pic longblob");
			int altered = pstmt.executeUpdate();
			if(altered>0){
				System.out.println("Successfully altered");
				this.con=db.getConnection();
				this.pstmt = con.prepareStatement("insert into images (pic) values(?)");
				
//				FileInputStream fis=new FileInputStream("src/com/insertImagesAbove65Kb/Ram.jpg");
				
				//file choose by jsfilechooser
				JFileChooser jfc=new JFileChooser();
				jfc.showOpenDialog(null);
				
				File file = jfc.getSelectedFile();
				
				FileInputStream fis=new FileInputStream(file);
				
				pstmt.setBinaryStream(1,fis,fis.available());
				
				int inserImage = pstmt.executeUpdate();
				 	
				if(inserImage>0) {
					System.out.println("image inserted into database");
				}
				else {
					System.out.println("Data insertion failed");
				}
			}else {
			System.out.println("unable to altered");	
			this.con=db.getConnection();
			this.pstmt = con.prepareStatement("insert into images (pic) values(?)");
			
//			FileInputStream fis=new FileInputStream("src/com/insertImagesAbove65Kb/Ram.jpg");
			
			//file choose by JFileChooser
			JFileChooser jfc=new JFileChooser();
			jfc.showOpenDialog(null);
			
			File file = jfc.getSelectedFile();
			
			FileInputStream fis=new FileInputStream(file);
			
			pstmt.setBinaryStream(1,fis,fis.available());
			
			int inserImage = pstmt.executeUpdate();
			 	
			if(inserImage>0) {
				System.out.println("image inserted into database");
			}
			else {
				System.out.println("Data insertion failed");
			}
			}
			
		}catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}finally {
			con.close();
		}
	}
	public static void main(String[] args) throws Exception {
		InsertImagesAbove65kb i = new InsertImagesAbove65kb();
		i.InsertOne();
	}
}
