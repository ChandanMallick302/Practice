package Fetching;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class iterator_entryset_Traversing {

	public static void main(String[] args) {
		Map<Integer, String> hm = new HashMap<>();

		// Adding Key and objects
		hm.put(1, "Apple");
		hm.put(4, "Orange");
		hm.put(2, "Mango");
		hm.put(1, "Grapes");

		Iterator<Entry<Integer, String>> iterator = hm.entrySet().iterator();
		while (iterator.hasNext()) {
			Entry<Integer,String> next = iterator.next();
			System.out.print(next.getKey()+" "+next.getValue()+"\n");
		}
	}

}