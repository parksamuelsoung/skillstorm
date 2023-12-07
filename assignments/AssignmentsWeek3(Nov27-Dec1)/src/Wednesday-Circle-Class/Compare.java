package com.skillstorm;

public class Compare {
	
	private String circle1;
	private String circle2;
	private boolean circlesAreEquals;
	
	public Compare(Circle circle1, Circle circle2) {
		this.circle1 = circle1.toString();
		this.circle2 = circle2.toString();
		circlesAreEquals = compareCircles();
	}
	
	public boolean compareCircles() {
		boolean compareCircles = false;
		if (circle1.equals(circle2)) {
			compareCircles = true;
		}
		return compareCircles;
	}

	@Override
	public String toString() {
		return "Compare [circlesAreEquals=" + circlesAreEquals + "]";
	}


	
	

}
