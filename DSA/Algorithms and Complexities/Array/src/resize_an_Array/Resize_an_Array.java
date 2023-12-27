package resize_an_Array;

public class Resize_an_Array {
	
	public static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static int[] resizeArray(int arr[],int capacity) {
		int temp[]=new int[capacity];
		for(int i=0;i<arr.length;i++) {
			temp[i]=arr[i];
		}
		arr=temp;
		return arr;
	}
	
	public static void main(String[] args) {
		int arr1[]=new int[4];
		arr1[0]=5;
		arr1[1]=9;
		arr1[2]=3;
		arr1[3]=10;
		printArray(arr1);
		System.out.println(arr1.length);
		
		//implementing resizing arraay
		arr1 = resizeArray(arr1, 8);
		System.out.println(arr1.length);
		printArray(arr1);
	}
}