package streamAPI.demo1;

import java.util.List;
import java.util.SortedMap;
import java.util.stream.Collectors;

public class StreamMethods {

	public static void main(String[] args) {

		List<String> cityNames = List.of("Ranchi", "Delhi", "Banglore", "Agra");
		cityNames.stream().filter(p -> p.endsWith("i")).forEach(c -> System.out.println(c));
		List<String> newList = cityNames.stream().filter(p -> p.startsWith("B")).collect(Collectors.toList());
		System.out.println(newList);
		System.out.println("---Counting length--");
		cityNames.stream().filter(p -> p.length() == 6).forEach(c -> System.out.println(c));
		
		
		List<Integer> numbers = List.of(23, 56, 80, 10, 5, 49);
		List<Integer> newNumbers = numbers.stream().map(f -> f * f).collect(Collectors.toList());
		System.out.println(newNumbers);
		// using Method Reference (:: operator)
		System.out.println("+++++++++++++++++++++");
		numbers.stream().map(f -> f + 100).forEach(System.out::println);

		
		System.out.println("--------------sorted-----------");
		numbers.stream().sorted().forEach(System.out::println);
		List<Integer> newList1 = numbers.stream().sorted().collect(Collectors.toList());
		System.out.println(newList1);
		
	}

}
