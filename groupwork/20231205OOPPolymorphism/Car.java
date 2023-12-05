package com.skillstorm;

public class Car implements Vehicle{
	private String make;
	private String model;
	private int year;
	
	public Car(String make, String model, int year) {
		this.make = make;
		this.model = model;
		this.year = year;
	}
	
	@Override
	public void go() {
		System.out.println("The car goes vroom vroom when we're being safe.");
		
	}

	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", year=" + year + "]";
	}
	
	
}