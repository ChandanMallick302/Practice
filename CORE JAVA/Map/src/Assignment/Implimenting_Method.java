package Assignment;

import java.util.HashMap;
import java.util.Map;

public class Implimenting_Method {

	public static void main(String[] args) {
		Map<String, Integer> Courses = new HashMap<String, Integer>();
		Courses.put("Java", 12000);
		Courses.put("python", 130000);
		Courses.put("FSJD", 120000);
		
		int size = Courses.size();
		System.out.println(size);
		
		Integer fee = Courses.get("Java");
		System.out.println("Java Fee is "+fee);
		
		Integer default1 = Courses.getOrDefault("python", 1);
		System.out.println(default1);

		
	}

}
