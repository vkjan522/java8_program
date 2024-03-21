package com.java8.lambdaExp;

interface Addable {
	int addition(int a, int b);
}

class AddableImpl implements Addable {

	@Override
	public int addition(int a, int b) {

		return a + b;
	}

}

public class LambdaExample4 {

	public static void main(String[] args) {

	}
}
