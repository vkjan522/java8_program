package streamAPI.demo2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapOperations {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(10, 20, 45, 15, 25, 40, 55, 45, 15, 55);
		List<Integer> square = numbers.stream().map(x -> x*x).collect(Collectors.toList());
		System.out.println(square);
		
		

	}

}
