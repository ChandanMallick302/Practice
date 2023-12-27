package Reverse_an_Array;

public class ReverseArray {

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void reverseArray(int numbers[], int start, int end) {
		while (start < end) {
			int temp = numbers[start];
			// swapping end value to start
			numbers[start] = numbers[end];
			// swapping start value to end
			numbers[end] = temp;

			// incrementing from 0th position
			start++;
			// decrementing from last position
			end--;
		}
	}

	public static void main(String[] args) {
		System.out.println("Intial vales are***********");
		int numbers[] = { 2, 11, 5, 10, 7, 8 };
		printArray(numbers);

		System.out.println("After Reversing******************");
		reverseArray(numbers, 0, numbers.length - 1);
		printArray(numbers);
	}
}