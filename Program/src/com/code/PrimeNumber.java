package com.code;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		Stream.iterate(0, x -> x+1)
			.limit(10)
			.forEach(System.out::println);
		
		System.out.println("++++++++++++++++++++++");
		
		Stream.iterate(0, x -> x+2)
			.limit(10)
			.forEach(System.out::println);
	
		System.out.println("++++++++++++++++++++++");
	
		Stream.iterate(0, x -> x<10, x -> x+1)
				.forEach(System.out::println);
		
		System.out.println("++++++++++++++++++++++");
		
		Stream.iterate(0, x -> x<10, y -> y+2)
				.forEach(System.out::println);
		
		System.out.println("++++++++++++++++++++++");
		
		Stream.iterate(0, x -> x<2, x -> x+1)
				.limit(5)
				.forEach(System.out::println);
		
		System.out.println("++++++++++++++++++++++");
		
//		Stream.iterate(0, x -> x<10, x -> x+1)
//			.filter(y -> y % Stream.iterate(2, i -> i < y/2, z -> z+1)
//					.mapToInt(val -> val.intValue()).findAny().getAsInt()!=0)
//			.forEach(System.out::println);
//		
//		int limit = 50;
//		
//		Stream.iterate(0, x -> x+1)
//		.limit(limit)
//		.filter(y -> y % Stream.iterate(limit/2, x -> )
//				.mapToInt(val -> val.intValue()).findAny().getAsInt()!=0)
//		.forEach(System.out::println);
		
		
		IntStream.range(2, 100)            
				.filter(val -> !IntStream.rangeClosed(2, val/2)            	
										.anyMatch(i -> val % i ==0) )		
				.forEach(System.out::println);
		
		System.out.println("++++++++++++++++++++++");
		
		IntStream.range(0, 10).forEach(System.out::println);
		
		System.out.println("++++++++++++++++++++++");
		
		IntStream.rangeClosed(0, 10).forEach(System.out::println);
		
		

		
	}

}
