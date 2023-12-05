package com.skillstorm;

public class ShapeTest {
	
	public static void main(String[] args) {
		Shape shape1 = new Shape("blue", 1, 1);
		Shape shape2 = new Shape("red", 1, 1);
		System.out.println(shape1);
		System.out.println(shape2);
		System.out.println(shape1.equals(shape2));
		System.out.println();
		
		Triangle triangle1 = new Triangle("blue", 3, 4, false);
		Triangle triangle2 = new Triangle("red", 3, 4, false);
		System.out.println(triangle1);
		System.out.println(triangle2);
		System.out.println(triangle1.equals(triangle2));
		System.out.println(triangle1.calculateArea());
		System.out.println(triangle1.calculatePerimeter());
		System.out.println();
		
		Rectangle rectangle1 = new Rectangle("blue", 5, 5, true);
		Rectangle rectangle2 = new Rectangle("blue", 5, 5, true);
		System.out.println(rectangle1);
		System.out.println(rectangle2);
		System.out.println(rectangle1.equals(rectangle2));
		System.out.println(rectangle1.calculateArea());
		System.out.println(rectangle1.calculatePerimeter());
		
	}

}
