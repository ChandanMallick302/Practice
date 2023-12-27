package move_Zeroes_to_end_of_an_Array;

public class move_Zeroes_to_end_of_an_Array {

	public static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void moveZeros(int arr[]) {
		int j = 0;// for index position
		for (int i = 0; i < arr.length; i++) {// i is for index value
			if (arr[i] != 0 && arr[j] == 0) {// condition for 0th element
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			if (arr[j] != 0) {
				j++;
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 0, 1, 0, 4, 12 };
		printArray(arr);
		moveZeros(arr);
		printArray(arr);

	}

}