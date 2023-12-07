package com.skillstorm;

public class Circle {
	
	private static double pie;
	private String color;
	private double radius;
	private double area;
	private double diameter;
	private double circumference;
	
	public Circle() {
		pie = Math.PI;
		this.color = "white";
		this.radius = 1;
		this.area = calculateArea();
		this.diameter = calculateDiameter();
		this.circumference = calculateCircumference();
	}
	
	public Circle(double radius, String color) {
		this();
		pie = Math.PI;
		this.color = color;
		this.radius = radius;
		this.area = calculateArea();
		this.diameter = calculateDiameter();
		this.circumference = calculateCircumference();
	}
	
	public double calculateArea() {
		return (pie * (Math.pow(radius, 2)));
	}
	
	public double calculateDiameter() {
		return (pie * (2 * radius));
	}
	
	public double calculateCircumference() {
		return (2 * pie * radius);
	}

	@Override
	public String toString() {
		return String.format("Circle [color=%s, radius=%s, area=%.2f,"
				+ " diameter=%.2f, circumference=%.2f]"
				, color, radius, area, diameter, circumference);
	}


	
	

}
