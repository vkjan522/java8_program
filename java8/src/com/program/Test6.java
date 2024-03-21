//Write a program to traverse(or iterate) HashSet?
package com.program;

import java.util.HashSet;
import java.util.Set;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> set = new HashSet<>();
		set.add("Apple");
		set.add("Mango");
		set.add("Lichi");
		set.add("Coconut");
		set.forEach(fruits -> System.out.println(fruits));

	}

}
