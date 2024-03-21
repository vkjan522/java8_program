//Write a program to convert List to Array
package com.program;

import java.util.ArrayList;
import java.util.List;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list = new ArrayList<>();
		list.add(120);
		list.add(456);
		list.add(598);
		System.out.println(list);

		Object[]  obj = list.toArray();

		/*
		 * for(int i=0;i<obj.length;i++){ System.out.println(obj[i]); }
		 */
		for (Object object : obj) {
			System.out.println(object);
			
		}

	}

}
