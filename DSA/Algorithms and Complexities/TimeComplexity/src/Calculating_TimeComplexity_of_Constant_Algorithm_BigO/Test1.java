package Calculating_TimeComplexity_of_Constant_Algorithm_BigO;

public class Test1 {

	public int findSum(int x, int y) {
		int sum = x + y;// 1+1+1+1=4 constant
		return sum;// 1+1=2 constant
		//Total Time Complex T=4+2=6
		//T=O(1)
		//So the total time will be 0.0004 sec
	}

	public static void main(String[] args) {
		double now = System.currentTimeMillis();
		Test1 t1 = new Test1();
		t1.findSum(4, 8);
		System.out.println("(Time taken " + (System.currentTimeMillis() - now) + " milli seconds");
	}
}
