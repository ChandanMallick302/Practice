package try_catch_finally_Exception_Handling;

public class FinallyBlock_with_try_catch {
public static void main(String[] args) {
	String s[]= {"6464","sas"};
	try {
		int n1 = Integer.parseInt(s[0]);
		int n2 = Integer.parseInt(s[1]);
		int result=n1/n2;
		System.out.println(result);
	}
	catch(NumberFormatException n) {
		System.out.println("Error!!");
		System.out.println(n.getMessage());
	}
	finally{ //Always get executed
		System.out.println("I am in finally block");
		System.out.println("Closing all the resources");
	}
	System.out.println("Program Teminated");
	}
}