package Unchecked_Exception_Handling;

public class ArrayIndexOutOfBounds_Exception {

	public static void main(String[] args) {
		System.out.println("Programiing is Started...");
		try {
			String[] a= {"50","10"};
			int n1 = Integer.parseInt(a[2]);//out of index
			int n2 = Integer.parseInt(a[3]);// out of index
			
		System.out.println("We have got two numbers");
		int result=n1/n2;
		System.out.println("Division is "+result);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Please don't leave any field");
			e.printStackTrace();
		}
		System.out.println("Program is Terminated");
	}

}
