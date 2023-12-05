package com.skillstorm;

import java.util.Objects;

public class CoffeeMug implements Fillable {

    private final double OUNCES;
    private double coffee;
    
    public CoffeeMug() {
    	this.OUNCES = 12;
    }

    public CoffeeMug(double ounces, double coffee) {
        this.OUNCES = ounces;
        this.coffee = coffee;
    }

    @Override
	public void fill() {
		this.coffee = this.OUNCES;
	}

	@Override
	public void empty() {
		this.coffee = 0;
	}

	@Override
	public void fill(double quantity) {
		if(this.coffee != this.OUNCES && quantity <= this.OUNCES - this.coffee) {
			this.coffee += quantity;
		} else {
			System.out.println("Too much coffee!");
		}
	}

	@Override
	public void empty(double quantity) {
		if(this.coffee != 0 && quantity <= this.OUNCES - this.coffee) {
			this.coffee += quantity;
		} else {
			System.out.println("Not enough coffee!");
		}
	}

	@Override
	public String toString() {
		return "CoffeeMug [OUNCES=" + OUNCES + ", coffee=" + coffee + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(OUNCES, coffee);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CoffeeMug other = (CoffeeMug) obj;
		return Double.doubleToLongBits(OUNCES) == Double.doubleToLongBits(other.OUNCES)
				&& Double.doubleToLongBits(coffee) == Double.doubleToLongBits(other.coffee);
	}

	

}