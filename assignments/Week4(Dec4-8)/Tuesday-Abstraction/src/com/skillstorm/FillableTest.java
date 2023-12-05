package com.skillstorm;

public class FillableTest {
	
	public static void main(String[] args) {
		test1();
		test2();
		test3();
	}
	
	public static void test1() {
		CoffeeMug coffeeMug = new CoffeeMug(16, 0);
		System.out.println(coffeeMug);
		
		coffeeMug.fill(8);
		System.out.println(coffeeMug);
		
		coffeeMug.empty(2);
		System.out.println(coffeeMug);
	}
	
	public static void test2() {
		GasTank gasTank = new GasTank();
		System.out.println(gasTank);
		
		gasTank.fill();
		System.out.println(gasTank);
		
		gasTank.empty();
		System.out.println(gasTank);
	}
	
	public static void test3() {
		CoffeeMug large = new CoffeeMug(16, 16);
		CoffeeMug grande = new CoffeeMug(16, 16);
		CoffeeMug small = new CoffeeMug(8, 8);
		
		System.out.println(large.equals(grande));
		System.out.println(small.equals(large));
	}

}
