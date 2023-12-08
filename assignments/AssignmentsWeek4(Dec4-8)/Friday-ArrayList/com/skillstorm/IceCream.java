package com.skillstorm;

import java.util.Objects;

public class IceCream {
    String flavor;
    double price;
    
    public IceCream() {
    	
    }
    
    public IceCream(String flavor, double price) {
    	this.flavor = flavor;
    	this.price = price;
    }

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return String.format("%s $%,.2f"
				, flavor, price);
	}

	@Override
	public int hashCode() {
		return Objects.hash(flavor, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IceCream other = (IceCream) obj;
		return Objects.equals(flavor, other.flavor)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}
    
    
    
}