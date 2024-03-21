package streamAPI.demo2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterOperation {

	public static void main(String[] args) {

		List<String> words = Arrays.asList("Ram", "Sita", "shayam", "Hanuman", "Krishna", "shiv", "Shiva");
		List<String> s_words = words.stream().filter(s -> s.toLowerCase().startsWith("s")).collect(Collectors.toList());
		System.out.println(s_words);

	}

}
