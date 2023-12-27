package SortedMap;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMap_SortedMap {
	public static void main(String[] args) {
		SortedMap<Integer, String> tsm = new TreeMap<Integer, String>();

		// Adding Key and objects
		tsm.put(1, "Apple");
		tsm.put(4, "Orange");
		tsm.put(2, "Grapes");
		tsm.put(1, "Grapes");
		
		System.out.println(tsm);
		System.out.println(tsm.tailMap(3));
		
		//TreeMap is the child of SortedMap
		//it will sort the key order
		//it will not accept duplicate key value
	}
}
