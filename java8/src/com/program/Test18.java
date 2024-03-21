//Given an element write a program to check if element(value) exists in ArrayList?
package com.program;

import java.util.ArrayList;
import java.util.List;

public class Test18 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		for(int i=1; i<=10; i++)
			list.add(i);
		System.out.println("List: "+ list);
		
		list.stream().forEach(i -> System.out.println(i));
		
		list.stream().forEach(System.out::println);

	}
}
