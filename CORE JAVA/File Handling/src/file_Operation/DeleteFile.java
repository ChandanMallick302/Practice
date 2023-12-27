package file_Operation;

import java.io.File;
import java.io.IOException;

public class DeleteFile {

	public static void main(String[] args) throws IOException {
		File file = new File("src/file_storage/LC.txt");

		try {
			if (file.exists()) {
				System.out.println("File Removed: "+file.delete());
			} else {
				System.out.println("File does not exists");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
