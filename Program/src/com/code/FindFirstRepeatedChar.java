package com.code;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstRepeatedChar {

	public static void main(String[] args) {
		String s = "vikash kumar";


		Map<Character, Long> charCount = s.chars().mapToObj(i -> (char) i)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
		
		
		Optional<Character> firstNonRepeatChar = charCount.entrySet().stream().filter((e) -> e.getValue() == 1)
				.map(e -> e.getKey()).findFirst();
		System.out.println("First Non Repeated Char: "+firstNonRepeatChar);

		Optional<Character> firstRepeatChar = charCount.entrySet().stream().filter((e) -> e.getValue() > 1)
				.map(e -> e.getKey()).findFirst();
		System.out.println("First Repeated Char: "+firstRepeatChar);
		
		
	}

}
