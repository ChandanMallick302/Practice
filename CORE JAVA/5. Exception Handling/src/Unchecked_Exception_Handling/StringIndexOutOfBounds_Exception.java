package Unchecked_Exception_Handling;

public class StringIndexOutOfBounds_Exception {

	public static void main(String[] args) {
		System.out.println("Programiing is Started...");
		String s="Chandan";
		try {
			String substring=s.substring(3,8);
			System.out.println("Chandan Substring is "+substring);
		}
		catch (StringIndexOutOfBoundsException e) {
			System.out.println("Please Select the With the String Index value");
			e.printStackTrace();
			e.getMessage();
		}
		System.out.println("Program Terminated");
	}

}
