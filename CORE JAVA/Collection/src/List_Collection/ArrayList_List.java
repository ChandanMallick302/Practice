package List_Collection;

import java.util.*;

public class ArrayList_List {
	public static void main(String[] args) {
		System.out.println("Welcome to ");
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(0);
		list.add(3);
		list.add(1);
		
		//output
		System.out.println(list);
		System.out.println(list.get(1));// 0
		System.out.println(list.get(3));// 1

		// 1. Given Oder preserved
		// 2. Duplicates are allowed
		//Array size will increase automatically
	}
}
