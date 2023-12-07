package com.skillstorm;

public class VehicleTest {
	
	public static void main(String[] args) {
		test1();
		test2();
		test3();
		test4();
		test5();
	}
	
	/* Test 1: */
	public static void test1() {
		Car car = new Car("Toyota", "4Runner", 2017);
		car.go();
	}
	
	/* Test 2: */
	public static void test2() {
		Train train = new Train("Blue", 15);
		train.go();
	}
	
	/* Test 3: */
	public static void test3() {
		Bike bike = new Bike("Red", 5);
		bike.go();
	}
	
	/* Test 4: IS-A vehicle*/
	public static void test4() {
		System.out.println();
		Vehicle vehicle1 = new Car("Toyota", "4Runner", 2017);
		Vehicle vehicle2 = new Train("Blue", 15);
		Vehicle vehicle3 = new Bike("Red", 5);
		System.out.println(vehicle1);
		System.out.println(vehicle2);
		System.out.println(vehicle3);
		System.out.println();		
	}
	
	/* Test 5: Commute */
	public static void test5() {
		Person bob = new Person("Bob", new Bike("Red", 5));
		bob.commute();
		Person bobjr = new Person("Bob Jr.", new Bike("Red", 5));
		System.out.println(bob);
		System.out.println(bobjr);
		System.out.printf("Is %s and %s the same person? %s", "Bob", "Bob Jr.", bob.equals(bobjr));
		System.out.println();
		
	}


}