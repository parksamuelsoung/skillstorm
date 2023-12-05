package com.skillstorm;

import java.util.Objects;

public class GasTank implements Fillable{

    private final double GALLONS;
    private double gas;

    public GasTank() {
        this.GALLONS = 20;
    }
    
    public GasTank(double gallons, double gas) {
        this.GALLONS = gallons;
        this.gas = gas;
    }

	@Override
	public void fill() {
		this.gas = this.GALLONS;
	}

	@Override
	public void empty() {
		this.gas = 0;
	}

	@Override
	public void fill(double quantity) {
		if(this.gas != this.GALLONS && quantity <= this.GALLONS - this.gas) {
			this.gas += quantity;
		} else {
			System.out.println("Too much gas!");
		}
	}

	@Override
	public void empty(double quantity) {
		if(this.gas != 0 && quantity <= this.GALLONS - this.gas) {
			this.gas += quantity;
		} else {
			System.out.println("Not enough gas!");
		}
	}

	@Override
	public String toString() {
		return "GasTank [GALLONS=" + GALLONS + ", gas=" + gas + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(GALLONS, gas);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GasTank other = (GasTank) obj;
		return Double.doubleToLongBits(GALLONS) == Double.doubleToLongBits(other.GALLONS)
				&& Double.doubleToLongBits(gas) == Double.doubleToLongBits(other.gas);
	}

	

	
}