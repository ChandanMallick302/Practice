package Unchecked_Exception_Handling;

public class NumberFormat_Exception {

	public static void main(String[] args) {
		System.out.println("Programiing is Started...");
		try {
		String s1="50";
		String s2="abc";
		int n1 = Integer.parseInt(s1);
		int n2 = Integer.parseInt(s2);
		System.out.println("We have got two numbers");
		int result=n1/n2;
		System.out.println("Division is "+result);
		}
		catch (NumberFormatException e) {
			System.out.println(e);
			e.printStackTrace();
		}
		System.out.println("Program is Terminated");
	}

}
