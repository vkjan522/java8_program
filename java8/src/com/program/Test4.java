package com.program;

import java.util.ArrayList;

public class Test4 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		list.add(34);
		list.add(56);
		list.add(23);
		list.add(89);
		list.add(17);
		list.add(20);
		
		//enhanced for loop
		for (Integer integer : list) {
			System.out.println(integer);
			
		}
		
		
		
		
		
	}

}
