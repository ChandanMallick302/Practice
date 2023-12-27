package file_Operation;

import java.io.File;
import java.io.IOException;

public class RenameFile {

	public static void main(String[] args) throws IOException {

		try {
			// Existing file Location
			File file1 = new File("src/file_storage/LC.txt");
			// Renaming File Location
			File fil2 = new File("src/file_storage/Java.txt");
			if (file1.exists()) {
				file1.renameTo(fil2);
			} else {
				System.out.println("File does not exists");
			}
			System.out.println("File Renaming Done...");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
