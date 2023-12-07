package com.skillstorm;


import java.util.Objects;

public class Rectangle extends Shape {
	
	private boolean looksLikeAWheatThin;

	public Rectangle() {
		super();
	}
	
	public Rectangle(String color, double length, double width, boolean looksLikeAWheatThin) {
		super(color, length, width);
		this.looksLikeAWheatThin = looksLikeAWheatThin;
	}

	public boolean isLooksLikeAWheatThin() {
		return looksLikeAWheatThin;
	}

	public void setLooksLikeAWheatThin(boolean looksLikeAWheatThin) {
		this.looksLikeAWheatThin = looksLikeAWheatThin;
	}



	@Override
	public String toString() {
		return "Triangle [looksLikeAWheatThin=" + looksLikeAWheatThin + ", getColor()=" + getColor() + ", getLength()="
				+ getLength() + ", getWidth()=" + getWidth() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(looksLikeAWheatThin);
		return result;
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Rectangle other = (Rectangle) obj;
		return looksLikeAWheatThin == other.looksLikeAWheatThin;
	}

	@Override
	public double calculateArea() {
		return (super.getLength() * super.getWidth());
	}
	
	@Override
	public double calculatePerimeter() {
		return (2 * getLength()) + (2 * getWidth());
	}

}
