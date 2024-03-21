package streamAPI.demo1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1 {

	public static void main(String[] args) {
		// Q) Create a list and filter all even number from list.
		List<Integer> list1 = List.of(2, 4, 9, 10, 30, 16, 18, 19, 40);

		List<Integer> list2 = new ArrayList<>();
		list2.add(2);
		list2.add(4);
		list2.add(9);
		list2.add(10);
		list2.add(30);
		list2.add(16);
		list2.add(18);
		list2.add(19);
		list2.add(40);

		List<Integer> list3 = Arrays.asList(2, 4, 9, 10, 30, 16, 18, 19, 40);

		List<Integer> listEven = new ArrayList<>();
		for (Integer i : list1) {
			if (i % 2 == 0)
				listEven.add(i);
		}
		
		System.out.println(list1);
		System.out.println("using For-Each Loop: " + listEven);

		// Using Stream
		Stream<Integer> stream = list1.stream();
		List<Integer> newList = stream.filter((p) -> p % 2 == 0).collect(Collectors.toList());
		System.out.println("Using Stream:" + newList);

		// Using Stream
		List<Integer> newList2 = list2.stream().filter(p -> p % 2 == 0).collect(Collectors.toList());
		System.out.println("List2: "+list2);
		System.out.println("newList2: "+newList2);

	}

}
