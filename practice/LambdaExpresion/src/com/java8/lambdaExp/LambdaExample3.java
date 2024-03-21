package com.java8.lambdaExp;

@FunctionalInterface
interface Bike {
	void getModelName();

}

public class LambdaExample3 {
	private static void print(Bike bike) {
		bike.getModelName();
	}

	public static void main(String[] args) {
		Bike c1 = () -> System.out.println("BMW");
		print(() -> System.out.println("Bullet"));
		print(c1);
	}
}
