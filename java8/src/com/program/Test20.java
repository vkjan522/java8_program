//Given an element write a program to check if element(value) exists in ArrayList?
package com.program;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test20 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(9);
		list.add(116);
		list.add(1234);
		list.add(4);
		list.add(2234);
		list.add(55);
		list.add(777);

		System.out.println("Before Sorting: " + list);

		List<Integer> sortedInDescOrder = list.stream().sorted((i,j) -> j-i ).collect(Collectors.toList());

		System.out.println("After Sorting: " + sortedInDescOrder);

	}
}
