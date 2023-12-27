package Remove_Even_Integers_from_an_Array;

public class RemoveEvenInteger {

	public static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	// finding the odd length
	public static int[] removedEven(int arr[]) {
		int oddCount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				oddCount++;
			}
		}
		// assigning odd length as the array length
		int[] resultArray = new int[oddCount];
		int idx = 0;

		// if data is odd add into the index of resultArray
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				resultArray[idx] = arr[i];
				idx++;
			}
		}
		return resultArray;
	}

	public static void main(String[] args) {
		// initializing array
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		// print the array
		printArray(arr);

		// removing Even vale from the list
		int[] result = removedEven(arr);
		// print the result
		printArray(result);
	}
}