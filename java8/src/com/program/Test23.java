package com.program;

import java.util.ArrayList;
import java.util.List;

public class Test23 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(9);
		list.add(116);
		list.add(1234);
		list.add(4);

		// Find 2nd highest number
		Integer secondHighest = list.stream().sorted((i, j) -> j - i).limit(2).min((i, j) -> i - j).get();
		System.out.println(secondHighest);

	}
}
