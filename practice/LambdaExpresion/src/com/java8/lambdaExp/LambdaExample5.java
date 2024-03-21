package com.java8.lambdaExp;

@FunctionalInterface
interface Addable1 {
	int addition(int a, int b);
}

public class LambdaExample5 {

	public static void main(String[] args) {
		
		Addable add = (x, y) -> (x+y);
		System.out.println(add.addition(12, 50));

	}
}
