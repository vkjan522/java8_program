//Given an element write a program to check if element(value) exists in ArrayList?
package com.program;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test12 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		for(int i=1; i<=8; i++)
			list.add(i);
		System.out.println("List: "+ list);
		
		//Increase list integer by 10
		List<Integer> newList=list.stream().map(i -> i+10).collect(Collectors.toList());
		
		System.out.println("New List: " + newList);

	}
}
