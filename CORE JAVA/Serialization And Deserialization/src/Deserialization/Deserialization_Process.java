package Deserialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import Serialization.Student;

public class Deserialization_Process {

	public static void main(String[] args) {
		try {
			// Give the path for creating and Read from file
			FileInputStream file = new FileInputStream("src/file_storage/student.txt");

			// Create a connection ObjectOutputStream & FileOutputStream
			// ObjectOutputStream will make object into the data
			ObjectInputStream o = new ObjectInputStream(file);

			try {
				Student s = (Student) o.readObject();
				System.out.println(s.getName());
				System.out.println(s.getEmail());
				System.out.println(s.getAge());
				System.out.println(s.getAddress());
			} finally {
				file.close();
				o.close();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}