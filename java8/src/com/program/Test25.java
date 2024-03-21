//Given an element write a program to check if element(value) exists in ArrayList?
package com.program;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Test25 {

	public static void main(String[] args) {
		HashMap<String, List> brandMap = new HashMap<>();
		brandMap.put("B1", addProduct("a", "b", "c"));
		brandMap.put("B2", addProduct("p", "q", "r"));
		brandMap.put("B3", addProduct("x", "y", "z"));

		brandMap.forEach((k, v) -> System.out.println("Key: " + k + ", Value: " + v));

	}

	public static List addProduct(String... productArr) {
		List<String> product = new ArrayList<>();
		for (String p : productArr) {
			product.add(p);
		}

		return product;
	}
}
