package com.program;

import java.util.ArrayList;
import java.util.List;

public class Test22 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(9);
		list.add(116);
		list.add(1234);
		list.add(4);

		Object[] arr =list.stream().toArray();
		for(Object ob:arr)
			System.out.println(ob);

	}
}
