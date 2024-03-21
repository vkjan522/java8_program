//Given an element write a program to check if element(value) exists in ArrayList?
package com.program;

import java.util.ArrayList;
import java.util.List;

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Mango");
		list.add("Lichi");
		list.add("Coconut");
		if(list.contains("Lichi"))
			System.out.println("true");
		else
			System.out.println("false");
		
	}

}
