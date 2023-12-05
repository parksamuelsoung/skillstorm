package com.skillstorm;

public class Test {
	
	public static void main(String[] args) {
		
		Circle circle1 = new Circle(6, "blue");
		System.out.println(circle1);
		Circle circle2 = new Circle(6, "blue");
		System.out.println(circle2);
		
		Compare compare = new Compare(circle1, circle2);
		System.out.println(compare);
	}

}
