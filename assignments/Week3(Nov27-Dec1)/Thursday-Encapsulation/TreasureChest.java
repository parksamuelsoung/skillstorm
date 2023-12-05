package com.skillstorm;

import java.util.Arrays;

public class TreasureChest {

    private double weightInLbs;
    private double height;
    private double length;
    private double width;
    private boolean isLocked;
    private Treasure[] contents;
    
    public TreasureChest() {
        double weightInLbs;
        double height;
        double length;
        double width;
        boolean isLocked;
        Treasure[] contents;
    }

	public TreasureChest(double weightInLbs, double height, double length, 
			double width, boolean isLocked, Treasure[] contents) {
		this();
		this.weightInLbs = weightInLbs;
		this.height = height;
		this.length = length;
		this.width = width;
		this.isLocked = isLocked;
		this.contents = contents;
	}

	public double getWeightInLbs() {
		return weightInLbs;
	}

	public void setWeightInLbs(double weightInLbs) {
		this.weightInLbs = weightInLbs;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
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

	public boolean isLocked() {
		return isLocked;
	}

	public void setLocked(boolean isLocked) {
		this.isLocked = isLocked;
	}

	public Treasure[] getContents() {
		if(isLocked == false) {
			return contents;
		} else {
			return null;
		}
	}

	public void setContents(Treasure[] contents) {
		if(isLocked == false) {
			this.contents = contents;
		} else {
			System.out.println("The Treasure Chest is locked!");
		}
	}

	@Override
	public String toString() {
		String lockedString = "locked";
		if(isLocked == false) {
			lockedString = "unlocked";
		}
		return String.format("The %.1f\" x %.1f\" x %.1f\" treasure chest weighs %.2flbs and is %s."
				, length, width, height, weightInLbs, lockedString);
	}

	

	
	
    
    
    
}


