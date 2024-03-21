package com.java8.lambdaExp;

@FunctionalInterface
interface Car {
	void getModelName();

}

public class LambdaExample2 {
	public static void main(String[] args) {
		Car ford = () -> System.out.println("Ford car name...");
		ford.getModelName();
		Car c1 = () -> System.out.println("Mustang car nam...");
		c1.getModelName();
	}
}
