package stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain1 {

	public static void main(String[] args) {
		
		//Q:- Create a List Filter all even number from List
		
		List<Integer> list1 = List.of(2,4,50,21,22,67);
		
		List<Integer> list2 =new ArrayList<>();
		list2.add(12);
		list2.add(34);
		list2.add(23);
		list2.add(78);
		
		List<Integer> list3 = Arrays.asList(23,456,45,78,69);
		
		//find the even number from list1 & store these into listEven
		
		//without-stream Api
		List<Integer> listEven = new ArrayList<>();
		for(Integer i:list1) {
			if(i%2==0) {
				listEven.add(i);
			}
		}
		System.out.println(list1);
		System.out.println(listEven);
		
		//or
		//using Stream Api
		Stream<Integer> stream = list1.stream();
//		stream.iterator().forEachRemaining(i->{System.out.print(i+" ");});
		List<Integer> NewlistEven = stream.filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(NewlistEven);
		stream.close();
		
		//Find the less-than 20 numbers from list1
		Stream<Integer> stream2 = list1.stream();
		List<Integer> Newlist = stream2.filter(i->i<20).collect(Collectors.toList());
		System.out.println(Newlist);
		
	}
}
