package Find_the_Missing_Number_in_an_Array;

public class Find_the_Missing_Number_in_an_Array {

	public static void demoArray() {
		int arr[] = { 1, 2, 3, 5 };
		printArray(arr);
		System.out.println("The missing is "+findMissingNumber(arr));
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	public static int findMissingNumber(int arr[]) {
		int n = arr.length;//5
		int sum = n * (n + 1) / 2;//5*(5+1)/2=15
		for (int i = 0; i < arr.length; i++) {
			sum = sum - i;
		}
		return sum;
	}

	public static void main(String[] args) {
		demoArray();
	}
}