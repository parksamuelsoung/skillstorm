package com.skillstorm;

public class Bike implements Vehicle {
	private String color;
	private int numGears;
	
	public Bike(String color, int numGears) {
		super();
		this.color = color;
		this.numGears = numGears;
	}

	@Override
	public void go() {
		System.out.println("The bike goes tap tap from a card in the spokes.");
		
	}

	@Override
	public String toString() {
		return "Bike [color=" + color + ", numGears=" + numGears + "]";
	}
	
	
}