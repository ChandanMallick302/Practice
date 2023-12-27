package methods_in_Stream_Api;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Methods {

	public static void main(String[] args) {

		// filter(predicate)
		// boolean value function
		// e->e>10

		List<String> names = List.of("Chandan", "Ramesh", "Ruresh", "Paresh");
		List<String> listNames = names.stream().filter(e -> e.startsWith("R")).collect(Collectors.toList());
		listNames.forEach(e -> {
			System.out.println(e);
		});

		// map(function)

		/*
		 * 
		 * each element operation
		 * 
		 */
		List<Integer> numbers = List.of(23, 4, 5, 6, 78, 65, 6);
		List<Integer> newNumbers = numbers.stream().map(i -> i * i).collect(Collectors.toList());
		System.out.println("square of each numers are: " + newNumbers);
		// or
		newNumbers.forEach(e -> {
			System.out.println(e);
		});
		
		//or
		newNumbers.forEach(System.out::println);
		
		//sorted()
		newNumbers.stream().sorted().forEach(e->{System.out.println(e);});
		
		//min()
		Integer min = newNumbers.stream().min((x,y)->x.compareTo(y)).get();
		System.out.println("Min :- "+min);
		
		//max()
		Integer max = newNumbers.stream().max((x,y)->x.compareTo(y)).get();
		System.out.println("Max :- "+max);
	}

}
