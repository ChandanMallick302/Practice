package Fetching_the_Collection;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterator_Traverse {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();

		al.add("Ramesh");
		al.add("Suresh");
		al.add("Rajesh");
		al.add("Paresh");
		al.add("Umesh");
		al.add("Bhabesh");

// List Operator only use for List and its child collection, because its object is present in List interface
		// Traversing by ListIterator
		ListIterator<String> listIterator = al.listIterator();

		System.out.println("++++++++++++++++++++++++++++++++++++");
		System.out.println("Forwarding");
		System.out.println("++++++++++++++++++++++++++++++++++++");

		// Forward Traversing by listIerator

		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}

		System.out.println("++++++++++++++++++++++++++++++++++++");
		System.out.println("Reversing");
		System.out.println("++++++++++++++++++++++++++++++++++++");

		// Backward Traversing
		// al.size() is mandatory
		ListIterator<String> listIterator2 = al.listIterator(al.size());
		while (listIterator2.hasPrevious()) {

			String previous = listIterator2.previous();
			System.out.println(previous);
		}

	}
}