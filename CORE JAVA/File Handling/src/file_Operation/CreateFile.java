package file_Operation;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws IOException {

		File file = new File("src/file_storage/LC.txt");
		try {
			if (file.createNewFile()) {
				System.out.println("File Successfully Created...!");
			} else {
				System.out.println("File is already exists...");
			}
		} catch (Exception e) {
			System.out.println("Exception Handled..!!!");
		}
	}
}