package file_Operation;

import java.io.*;

public class Write_Inside_File {

	public static void main(String[] args) throws IOException {
		//Write Operation by the help of FileWriter
//		try {
//			FileWriter writer = new FileWriter("src/file_storage/LC.txt");
//			try {
//				writer.write("JavaPrograming is the best language");
//			} finally {
//				writer.close();
//			}
//			System.out.println("Data is inserted in file successfully");
//		} catch (Exception e) {
//			System.out.println(e);
//		}

		// or

//		Write Operation by the help of BufferedWriter
		
//		try {
//			BufferedWriter writer1 = new BufferedWriter(new FileWriter("src/file_storage/LC.txt"));
//			try {
//				writer1.wri//Write Operation by the help of BufferedWriterte("Hello World..!!");
//			}finally {
//				writer1.close();
//			}
//			System.out.println("Successfully written in file BufferedWriter");
//		} catch (Exception e) {
//			System.out.println(e);
//		}

		// or
		
//		Write Operation by the help of BufferedOutputStream

//		try {
//			BufferedOutputStream file2 = new BufferedOutputStream(new FileOutputStream("src/file_storage/LC.txt"));
//			String str = new String("Chandan dkjbdksb");
//			byte[] write2 = str.getBytes();
//			try {
//				for (byte b : write2) {
//					file2.write(b);
//				}
//
//			} finally {
//				file2.close();
//			}
//			System.out.println("Successfully data is written in File by BufferedOutputStream");
//		} catch (Exception e) {
//			System.out.println(e);
//		}

		// or
		
//		Write Operation by the help of PrintWriter
		
		try {
			PrintWriter writer3 = new PrintWriter("src/file_storage/LC.txt");
			try {
				writer3.write("dsvjhvdsvdjsvjv");
			} finally {
				writer3.close();
			}
			System.out.println("Successfully data is written in File by PrintWriter");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
