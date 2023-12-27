package Sorting_the_Data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Sorting {

	public static void main(String[] args) {
		Map<String, Integer> Courses = new HashMap();
		Courses.put("Java", 12000);
		Courses.put("python", 130000);
		Courses.put("FSJD", 120000);

		// Sorting key in descending order
		System.out.println("Sorting Course in Descending order");

		List<Map.Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(Courses.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return o2.getKey().compareTo(o1.getKey());
			}
		});
		list.forEach(k -> {
			System.out.println(k.getKey() + " " + k.getValue());
		});

		// sorting value in ascending order
		System.out.println("Sorting Fee in Ascending order");
		List<Map.Entry<String, Integer>> list2 = new ArrayList<>(Courses.entrySet());
		list2.sort(new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				// TODO Auto-generated method stub
				return o1.getValue() - o2.getValue();
			}
		});

		list2.forEach(v -> {
			System.out.println(v.getKey() + " " + v.getValue());
		});
	}
}
