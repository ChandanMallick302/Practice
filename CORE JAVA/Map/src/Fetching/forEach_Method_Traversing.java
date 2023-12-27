package Fetching;

import java.util.HashMap;
import java.util.Map;

public class forEach_Method_Traversing {

	public static void main(String[] args) {
		Map<Integer, String> hm = new HashMap<>();

		// Adding Key and objects
		hm.put(1, "Apple");
		hm.put(4, "Orange");
		hm.put(2, "Mango");
		hm.put(1, "Grapes");

		hm.entrySet().forEach(e -> {
			System.out.println(e.getKey() + " " + e.getValue());
		});

		// or
		hm.forEach((key, value) -> {
			System.out.print(key + " ");
			System.out.println(value);
		});

	}

}
