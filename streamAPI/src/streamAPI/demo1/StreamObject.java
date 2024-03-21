package streamAPI.demo1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {

	public static void main(String[] args) {

		// Stream API = process of collection
		// collection/ group of object

		// 1st = black stream
		Stream<Object> stream1 = Stream.empty();

		// 2nd = Array, object, collection

		String name[] = { "vikash", "kumar" };
		Stream<String> stream2 = Stream.of(name);
		stream1.forEach(c -> System.out.println(c));

		// 3rd = Builder patter
		Stream<Object> stream3 = Stream.builder().build();

		// 4th arrays

		IntStream stream4 = Arrays.stream(new int[] { 3, 5, 8, 10, 30 });
		stream4.forEach(c -> System.out.println(c));
		
		// 5th - collection object = list, set, etc
		
		System.out.println("++++++++++++++++++++++++++++++++++++");
		List<Integer> list1 = Arrays.asList(2, 4, 9, 10, 30, 16, 18, 19, 40);
		Stream<Integer> newList = list1.stream();
		newList.forEach(c -> System.out.println(c));

	}

}
