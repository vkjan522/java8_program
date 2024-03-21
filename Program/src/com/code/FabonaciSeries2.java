package com.code;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FabonaciSeries2 {

	public static void main(String[] args) {

		List<Integer> l1 = Stream.iterate(0, x -> x + 1)
				.limit(10)
				.collect(Collectors.toList());    
		System.out.println(l1);
		
		Integer add = Stream.iterate(0, x -> x + 1)
				.limit(10) 						//it will return Stream<Object>, here we can't call sum().
				.mapToInt(x -> x.intValue())    //it will return Stream<Integer>, so we can apply sum() on it.
				.sum();						
				
		System.out.println(add);
		
		String s = Stream.iterate(0, x -> x + 1)
				.limit(10)
				.map(x -> String.valueOf(x))           //it will return Stream<String>
				.collect(Collectors.joining(", "));    // here, we are joining strings through comma(,).
		System.out.println(s);
		
		Stream.iterate(new int[]{0,1},  x -> new int[]{x[1], x[0]+x[1]})
											.limit(10)                       //it will return Stream<int[]>
											.map(x -> x[0])					//here, it will return the 0th element of each array
											.forEach(arr -> System.out.println(arr));
		
		
	String fibSeriesString = Stream.iterate(new int[]{0,1},  x -> new int[]{x[1], x[0]+x[1]})
		.limit(10)                       //it will return Stream<int[]>
		.map(x -> x[0])	
		.map(x -> String.valueOf(x))			//Converting int to String, so that joining can be perform easily.
		.collect(Collectors.joining(", "));
	System.out.println(fibSeriesString);
	
	
	List<Integer> fibSeriesList = Stream.iterate(new Integer[]{0,1},  x -> new Integer[]{x[1], x[0]+x[1]})
			.limit(10)                       //it will return Stream<int[]>
			.map(x -> x[0])	
			.collect(Collectors.toList());
		System.out.println(fibSeriesList);
		
		
		
		
	}

}
