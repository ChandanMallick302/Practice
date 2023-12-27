package special;

public class This_Operator {

	int a;
	int b;
	public This_Operator(int a, int b) {
		this.a=a;
		this.b=b;
		System.out.println("Sum is "+(a+b));
	}
	public static void main(String[] args) {
		This_Operator to=new This_Operator(10, 25); // Sum is 35
	}

}
