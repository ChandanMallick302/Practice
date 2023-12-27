package Multiple_Exception_Handling;

public class Multiple_Exception_Handling_try_catch {

	
	public static void main(String[] args) {
	String s[]= {"6464","5454"};
	try {
		int n1 = Integer.parseInt(s[0]);
		int n2 = Integer.parseInt(s[3]);
		int result=n1/n2;
		System.out.println(result);
	}
	catch (NumberFormatException n) {
		System.out.println("Invalid numbers");
		n.getMessage();
	}
	catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("Please enter inde the array length");
		e.getMessage();
	}
	}

}
