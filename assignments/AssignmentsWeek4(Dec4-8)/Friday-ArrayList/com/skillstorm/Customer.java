package com.skillstorm;

import java.util.Objects;

public class Customer {
    private IceCream iceCream;
    private String name;
    
    public Customer() {
    	
    }
    
    public Customer(IceCream iceCream, String name) {
    	this.iceCream = iceCream;
    	this.name = name;
    }

	public IceCream getIceCream() {
		return iceCream;
	}

	public void setIceCream(IceCream iceCream) {
		this.iceCream = iceCream;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return String.format("%s", name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(iceCream, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(iceCream, other.iceCream) && Objects.equals(name, other.name);
	}
    
    
    
}

