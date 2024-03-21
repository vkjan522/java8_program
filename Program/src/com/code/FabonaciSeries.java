package com.code;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FabonaciSeries {

	public static void main(String[] args) {


		List<Integer> l1 = Stream.iterate(0, x -> x + 1)
				.limit(10)
				.collect(Collectors.toList());
		System.out.println(l1);

	}

}
