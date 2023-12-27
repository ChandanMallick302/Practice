package Checked_Exception_Handling;

public class ClassNotFound_Exception_Handling {

	public static void main(String[] args) throws ClassNotFoundException {
		try {
			// Calling the class gfg which is not present in the
			// current class temp instance of calling class
			Class temp = Class.forName("FSFS");
			System.out.println(temp);
			// It will throw ClassNotFoundException
		} catch (ClassNotFoundException c) {
			System.out.println(c.getMessage());
		}
	}

}
