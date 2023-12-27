package TimeComplexity;

class Program1 {
	public int findSum(int n) {
		return n * (n + 1) / 2;
	}
}

class Program2 {
	public int findSum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		return sum;
	}
}

public class Demo1_FindSumOfNatualnumber {

	public static void main(String[] args) {
		double now1=System.currentTimeMillis();
		Program1 p1=new Program1();
		System.out.println(p1.findSum(5));
		System.out.println("Time taken "+(System.currentTimeMillis()-now1)+" milliseconds");//Time taken 2.0 milliseconds
		System.out.println("+++++++++++++++++++++++++++++++++++++");
		
		double now2=System.currentTimeMillis();
		Program2 p2=new Program2();
		System.out.println(p2.findSum(5));
		System.out.println("Time taken "+(System.currentTimeMillis()-now2)+" milliseconds");//Time taken 2.0 milliseconds
		System.out.println("+++++++++++++++++++++++++++++++++++++");
	
		//Best Algorithm
		double now3=System.currentTimeMillis();
		Demo1_FindSumOfNatualnumber p3=new Demo1_FindSumOfNatualnumber();
		System.out.println(p3.findSum(5));
		System.out.println("Time taken "+(System.currentTimeMillis()-now3)+" milliseconds");//Time taken 0.0 milliseconds
	}
	public int findSum(int n) {
		return n * (n + 1) / 2;
	}

}
