package Assignment_Of_Array;

public class i_Addition_of_all_index {
	public static void main(String[] args) {
		int[] x = { 1, 4, 5, 8, 6 };
		int sum = x[0] + x[1] + x[2] + x[3] + x[4];
		System.out.println(sum);

		int add=0;
		for (int i = 0; i < x.length; i++) {
			add =add+ x[i];
		}
		System.out.println(add);
	}
}