package Multiple_Exception_Handling;

public class Multiple_Exception_Handling_by_Exception {

	
	public static void main(String[] args) {
	String s[]= {"6464","sas"};
	try {
		int n1 = Integer.parseInt(s[0]);
		int n2 = Integer.parseInt(s[1]);
		int result=n1/n2;
		System.out.println(result);
	}
	catch (NumberFormatException n) {
		System.out.println("Error!!");
		System.out.println(n.getMessage());
	}
	}

}
