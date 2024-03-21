//Given an element write a program to check if element(value) exists in ArrayList?
package com.program;

import java.util.HashSet;
import java.util.Set;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> set = new HashSet<>();
		set.add("Apple");
		set.add("Mango");
		set.add("Lichi");
		set.add("Coconut");
		if(set.contains("Lichi"))
			System.out.println("true");
		else
			System.out.println();
		
	}

}
