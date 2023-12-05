package com.skillstorm;

public class Train implements Vehicle{
	private String color;
	private int numCars;
	
	public Train(String color, int numCars) {
		this.color = color;
		this.numCars = numCars;
	}
	
	@Override
	public void go() {
		System.out.println("The train goes chuga choo choo at the station.");
		
	}

	@Override
	public String toString() {
		return "Train [color=" + color + ", numCars=" + numCars + "]";
	}
	
	
}