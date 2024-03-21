package com.program;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test21 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(9);
		list.add(116);
		list.add(1234);
		list.add(4);

		List<Integer> peekList =list.stream()
				.peek(i -> System.out.println("Before opeartion: "+i))
				.map(i-> i+5)
				.peek(i -> System.out.println("After opeartion: "+i))
				.collect(Collectors.toList());

		System.out.println("After Opration: " + peekList);

	}
}
