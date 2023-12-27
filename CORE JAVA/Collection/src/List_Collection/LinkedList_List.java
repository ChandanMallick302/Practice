package List_Collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedList_List {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(5);
		list.add(3);
		list.add(4);
		list.add(1);

		list.forEach(a -> {
			System.out.println(a);
		});

		// 1. Given Oder preserved
		// 2. Duplicates are allowed
		// Array size will increase when required
	}
}
