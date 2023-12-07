package com.skillstorm;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter the radius: ");
		double radius = scanner.nextDouble();
		scanner.nextLine();
		
		try {
			Circle circle1 = new Circle("blue", radius);
			System.out.println(circle1);
			System.out.printf("Area: %.2f", circle1.calculateArea());
		} catch (InvalidSizeException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("\n");
		
		System.out.print("Please enter another radius: ");
		double radius2 = scanner.nextDouble();
		scanner.nextLine();

		try {
			Circle circle2 = new Circle("blue", radius2);
			System.out.println(circle2);
		} catch (InvalidSizeException e) {
			System.out.println(e.getMessage());
		}
		System.out.println();
		
		scanner.close();
	}

}
