package com.skillstorm;

import java.util.Objects;

public class Triangle extends Shape {
	
	private boolean looksLikeADorito;

	public Triangle() {
		super();
	}
	
	public Triangle(String color, double length, double width, boolean looksLikeADorito) {
		super(color, length, width);
		this.looksLikeADorito = looksLikeADorito;
	}

	public boolean isLooksLikeADorito() {
		return looksLikeADorito;
	}

	public void setLooksLikeADorito(boolean looksLikeADorito) {
		this.looksLikeADorito = looksLikeADorito;
	}



	@Override
	public String toString() {
		return "Triangle [looksLikeADorito=" + looksLikeADorito + ", getColor()=" + getColor() + ", getLength()="
				+ getLength() + ", getWidth()=" + getWidth() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(looksLikeADorito);
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
		Triangle other = (Triangle) obj;
		return looksLikeADorito == other.looksLikeADorito;
	}
	
	@Override
	public double calculateArea() {
		return (super.getLength() * super.getWidth()) / 2;
	}
	
	@Override
	public double calculatePerimeter() {
		double hypothenuse = (Math.sqrt(Math.pow(super.getWidth(), 2) + Math.pow(super.getLength(), 2)));
		return getLength() + getWidth() + hypothenuse;
	}

}
