package Calculating_TimeComplexity_of_Polynomial_Algorithm_BigO;


public class Test1 {
	
	public void print(int n) {
		for(int i=1;i<=n;i++) {//1+3(n+1)+3n=6n+4
			System.out.println("Stating of outer loop");
			for(int j=1;j<=n;j++) {//n(1+3(n+1)+3n)=n(6n+4)=6n2+4n
				System.out.println("Stating of inner loop");
				System.out.println("i= "+i+" j= "+j);//n2(1+1+1)=3n2
			}
			System.out.println("End of inner loop");
		}
		System.out.println("End of outer loop");
	}
	//Total time complex T=6n+4+6n2+4n+3n2+n+1
	//T=9n2+11n+5
	//T~O(N2)
	
	//Bad so it is refer to use
	public static void main(String[] args) {
		
		double now = System.currentTimeMillis();
		Test1 t1 = new Test1();
		t1.print(5);
		System.out.println("Time taken " + (System.currentTimeMillis() - now) + " milli seconds");
	}

}
