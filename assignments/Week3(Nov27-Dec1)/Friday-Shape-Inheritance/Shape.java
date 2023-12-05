package com.skillstorm;

import java.util.Objects;

public class Shape {
	
	private String color;
	private double area;
	private double perimeter;
	private double length;
	private double width;
	
	public Shape() {
		super();
		String color;
		double length;
		double width;
		double area;
		double perimeter;
	}
	
	public Shape(String color, double length, double width) {
		super();
		this.color = color;
		this.length = length;
		this.width = width;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getPerimeter() {
		return perimeter;
	}

	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}

	@Override
	public String toString() {
		return String.format("Circle [color=%s, length=%.2f, width=%.2f, area=%.2f,"
				+ " perimeter=%.2f]"
				, color, length, width, area, perimeter);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(length, width, area, perimeter, color);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Shape other = (Shape) obj;
		return Double.doubleToLongBits(area) == Double.doubleToLongBits(other.area)
				&& Double.doubleToLongBits(perimeter) == Double.doubleToLongBits(other.perimeter)
				&& Double.doubleToLongBits(length) == Double.doubleToLongBits(other.length)
				&& Double.doubleToLongBits(width) == Double.doubleToLongBits(other.width)
				&& Objects.equals(color, other.color);
	}

	public double calculateArea() {
		return 0;
	}
	
	public double calculatePerimeter() {
		return 0;
	}



}
