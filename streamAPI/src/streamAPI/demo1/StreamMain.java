package streamAPI.demo1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {

	public static void main(String[] args) {
		List<Integer> list1 = List.of(2, 4, 17, 35, 70, 45, 35, 40);
		// list1.add(50);
		System.out.println(list1);

		List<Integer> list2 = new ArrayList<>();
		list2.add(29);
		list2.add(35);
		list2.add(20);
		list2.add(30);
		list2.add(50);
		list2.add(25);

		System.out.println(list2);

		List<Integer> list3 = Arrays.asList(30, 40, 20, 10, 67, 47, 23, 39);
		System.out.println(list3);

		// List1, Without Stream
		List<Integer> evenList = new ArrayList<>();
		for (Integer i : list1) {
			if (i % 2 == 0) {
				evenList.add(i);
			}
		}
		System.out.println(list1);
		System.out.println(evenList);

		// List1, Using Stream API

		Stream<Integer> stream = list1.stream();
		List<Integer> newList = stream.filter(p -> p % 2 == 0).collect(Collectors.toList());
		System.out.println(newList);

		List<Integer> newList1 = list1.stream().filter(p -> p % 2 == 0).collect(Collectors.toList());
		System.out.println(newList1);
		
		
		
	}

}
