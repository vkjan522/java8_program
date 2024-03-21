package com.program;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class Test3 {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		map.put("Book1", 1000);
		map.put("Book2", 5000);
		map.put("Book3", 3000);
		map.put("Book4", 8000);
		map.put("Book5", 2000);

		Collection<Integer> col = map.values();
		Integer total = 0;

		for (Integer p : col) {
			BiFunction<Integer, Integer, Integer> biF = (i, j) -> i + j;
			Integer res = biF.apply(p, total);
			total = res;
		}
		System.out.print(total);

	}

}