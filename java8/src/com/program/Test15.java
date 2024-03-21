//Given an element write a program to check if element(value) exists in ArrayList?
package com.program;

import java.util.ArrayList;
import java.util.List;

public class Test15 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		for(int i=1; i<=8; i++)
			list.add(i);
		System.out.println("List: "+ list);
		
		Integer max=list.stream().max((i,j) -> i-j).get();
		
		System.out.println("Maximum value of List: " + max);

	}
}
