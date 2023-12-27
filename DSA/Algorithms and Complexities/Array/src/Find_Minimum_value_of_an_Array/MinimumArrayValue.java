package Find_Minimum_value_of_an_Array;

public class MinimumArrayValue {

	public static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static int findMinimum(int arr[]) {
		//condition for invalid input
		if(arr==null || arr.length==0) {
			throw new IllegalArgumentException("Invalid input");
		}
		
		// set the first position of array to min variable, if 0th position is less than
		// other value than return min.
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			// if min is greater than other position of array then store that value in min
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		int arr[] = { 5, 9, 3, 5, 1, 2 };
		System.out.print("Find the minimum value from ");
		printArray(arr);
		System.out.println("The minimum value is " + findMinimum(arr));
	}
}