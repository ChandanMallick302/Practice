package Unchecked_Exception_Handling;

public class NullPointer_Exception {

	public static void main(String[] args) {
		System.out.println("Programiing is Started...");
		String a=null;
		try {
			if(a.equals("dsd")) {
				System.out.println("same");
			}
			else {
				System.out.println("Not same");
			}
		}
		catch (NullPointerException e) {
			System.out.println("Please don't compare null value with existing value");
			e.printStackTrace();
		}
		System.out.println("Program is Terminated");
	}

}
