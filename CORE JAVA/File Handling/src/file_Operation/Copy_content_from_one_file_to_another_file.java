package file_Operation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy_content_from_one_file_to_another_file {

	public static void main(String[] args)throws IOException {
		System.out.println("Program Started...!!!");
		try {
			//To read the file1 data
			FileInputStream file1=new FileInputStream("src/file_storage/Java.txt");
			
			//copy the data from file1 to New file2
			FileOutputStream file2=new FileOutputStream("src/file_storage/Java3.txt");
			try {
				int i;
				while((i=file1.read())!=-1) {
					file2.write((char)i);
				}
				
			}finally {
				file1.close();
				file2.flush();
				file2.close();
			}
			System.out.println("Data Copied Successfully");
			
		}catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("Program Stopped");

	}

}
