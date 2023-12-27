package Fetching;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StreamApi_Entryset_Traversing {

	public static void main(String[] args) {
		Map<Integer, String> hm = new HashMap<>();

		// Adding Key and objects
		hm.put(1, "Apple");
		hm.put(4, "Orange");
		hm.put(2, "Mango");
		hm.put(1, "Grapes");

		hm.entrySet().stream().forEach(entry->{System.out.println(entry.getKey()+" "+entry.getValue());});;
	}

}