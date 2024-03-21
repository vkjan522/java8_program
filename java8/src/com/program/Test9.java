//Given an element write a program to check if element(value) exists in ArrayList?
package com.program;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test9 {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		for(int i=1; i<=50; i++)
			list.add(i);
		System.out.println("List: "+ list);
		
		List<Integer> evenList=list.stream().filter(i -> i%2==0).collect(Collectors.toList());
		System.out.println("Even List: "+ evenList);
		
		List<Integer> oddList=list.stream().filter(i -> i%2!=0).collect(Collectors.toList());
		System.out.println("Odd List: "+ oddList);
		
		List<Integer> primeList=list.stream().filter(i -> {
							int count=0;
							for(int c=2; c<=i/2; c++) {
								if(i%c==0) {
									count++;
									break;
								}	
							}
							if(count==0)
								return true;
							else
								return false;
								
					}).collect(Collectors.toList());
		System.out.println("Prime List: "+ primeList);
	}
}
