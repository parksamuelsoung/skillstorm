package com.skillstorm;

import static java.lang.Math.PI;

import java.util.Objects;

public class Circle {
	
	private String color;
	private double radius;
	private double area;
	private double diameter;
	private double circumference;
	
	public Circle() {
		
	}
	
	public Circle(String color, double radius) {
		this.color = color;
		if(radius<=0) {
			throw new InvalidSizeException("Radius cannot be less than or equal to 0!");
		} else {
			this.radius = radius;
		}
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		if(radius<=0) {
			throw new InvalidSizeException("Radius cannot be less than or equal to 0!");
		} else {
			this.radius = radius;
		}
	}

	public double getArea() {
		return area;
	}

	public double getDiameter() {
		return diameter;
	}

	public double getCircumference() {
		return circumference;
	}

	public double calculateArea() {
		return (PI * (Math.pow(radius, 2)));
	}
	
	public double calculateDiameter() {
		return (PI * (2 * radius));
	}
	
	public double calculateCircumference() {
		return (2 * PI * radius);
	}

	@Override
	public String toString() {
		return String.format("Circle [color=%s, radius=%s]"
				, color, radius);
	}

	@Override
	public int hashCode() {
		return Objects.hash(area, circumference, color, diameter, radius);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		return Double.doubleToLongBits(area) == Double.doubleToLongBits(other.area)
				&& Double.doubleToLongBits(circumference) == Double.doubleToLongBits(other.circumference)
				&& Objects.equals(color, other.color)
				&& Double.doubleToLongBits(diameter) == Double.doubleToLongBits(other.diameter)
				&& Double.doubleToLongBits(radius) == Double.doubleToLongBits(other.radius);
	}


	
	

}
