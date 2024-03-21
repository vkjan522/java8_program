package com.code;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EvenOrOdd {

	public static void main(String[] args) {
		int[] arr = {2,4,8,9,10,50,48,20,30,45,77,13};
		Map<Boolean, List<Integer>> numbers = Arrays.stream(arr).boxed().collect(Collectors.partitioningBy(i -> i %2 ==0));
		System.out.println(numbers.get(true).size());
		System.out.println(numbers.get(false).size());

		IntStream.
		
		
		
	}

}
