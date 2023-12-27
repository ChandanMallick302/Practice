package print_elements_of_an_Array;

public class ArrayUtil {

	public void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		ArrayUtil a1 = new ArrayUtil();
		a1.printArray(new int[] { 5, 1, 2, 9, 10 });
	}
}
