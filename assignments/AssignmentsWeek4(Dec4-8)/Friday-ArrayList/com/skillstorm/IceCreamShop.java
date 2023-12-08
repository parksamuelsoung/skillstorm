package com.skillstorm;

import java.util.ArrayList;
import java.util.Objects;

public class IceCreamShop {

    private String name;
    private double amountEarned;
    private ArrayList<IceCream> flavors = new ArrayList<>();
    private ArrayList<Customer> customerLine = new ArrayList<>(); 
    
    public IceCreamShop() {
		
	}

    public IceCreamShop(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAmountEarned() {
		return amountEarned;
	}

	public void setAmountEarned(double amountEarned) {
		this.amountEarned = amountEarned;
	}

	public ArrayList<IceCream> getFlavors() {
		return flavors;
	}

	public void setFlavors(ArrayList<IceCream> flavors) {
		this.flavors = flavors;
	}
	
    public void addFlavor(IceCream flavor) throws IllegalArgumentException {
        if(flavors.contains(flavor)) {
        	throw new IllegalArgumentException("The icecream flavor already exists.");
        } else {
        	flavors.add(flavor);
        }
    }
    
    public void removeFlavor(IceCream flavor) {
        flavors.remove(flavor);
    }

	public ArrayList<Customer> getCustomerLine() {
		return customerLine;
	}

	public void setCustomerLine(ArrayList<Customer> customerLine) {
		this.customerLine = customerLine;
	}
	
    public void addCustomer(Customer c) {
        customerLine.add(c);
    }
    
	public void serviceCustomer() throws IllegalArgumentException{
    	Customer customer = customerLine.get(0);
    	if(customer.getIceCream() == null) {
    		throw new IllegalArgumentException("Customer does not have ice cream yet.");
    	} else if(!flavors.contains(customer.getIceCream())) {
    		throw new IllegalArgumentException("The icecream flavor does not exist.");
    	} else {
        	amountEarned += customer.getIceCream().getPrice();
        	customerLine.remove(0);
    	}

    }

	@Override
	public String toString() {
		return String.format("IceCreamShop %s%nTotal Revenue: $%,.2f%nFlavors: %s%nServing: %s"
				, name, amountEarned, flavors, customerLine);
	}

	@Override
	public int hashCode() {
		return Objects.hash(amountEarned, customerLine, flavors, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		IceCreamShop other = (IceCreamShop) obj;
		return Double.doubleToLongBits(amountEarned) == Double.doubleToLongBits(other.amountEarned)
				&& Objects.equals(customerLine, other.customerLine) && Objects.equals(flavors, other.flavors)
				&& Objects.equals(name, other.name);
	}


}