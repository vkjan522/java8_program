package streamAPI.demo2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedOperation {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(56, 49, 20, 10, 70, 55, 90, 100);
		List<Integer> sortedNumbers = numbers.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedNumbers);

		List<String> words = Arrays.asList("Vikash", "Ram", "Sita", "mohan", "Mahesh","Mohan");
		List<String> sortedWords = words.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedWords);
	}

}
