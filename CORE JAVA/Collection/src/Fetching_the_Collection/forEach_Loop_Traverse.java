package Fetching_the_Collection;

import java.util.ArrayList;

public class forEach_Loop_Traverse {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();

		al.add("Ramesh");
		al.add("Suresh");
		al.add("Rajesh");
		al.add("Paresh");
		al.add("Umesh");
		al.add("Bhabesh");

//forEach loop use for all collections

		// traversing by forEach loop
		for (String a : al) {
			System.out.println(a);
		}

		// Reversing by StringBuffer
		StringBuffer buffer = new StringBuffer(al.toString());
		buffer.reverse();
		System.out.println(buffer);

	}

}