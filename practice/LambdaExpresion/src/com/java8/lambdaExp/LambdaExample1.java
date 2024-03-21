package com.java8.lambdaExp;

interface Shape {
	void draw();
}

class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Rectangle class: draw()");
	}
}

class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Square class: draw()");
	}
}

class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Circle class: draw()");
	}
}

public class LambdaExample1 {
	public static void main(String[] args) {
		Shape circle = new Circle();
		circle.draw();
	}
}
