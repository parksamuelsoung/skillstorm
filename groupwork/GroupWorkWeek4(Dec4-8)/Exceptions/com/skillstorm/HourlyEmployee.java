package com.skillstorm;

import java.util.Objects;

public class HourlyEmployee extends Employee {
	private double hoursWorked;
	private double wage;
	
	public HourlyEmployee() {
		
	}
	
	public HourlyEmployee(long id, String name, Employee manager,double hoursWorked, double wage) {
		super(id, name, manager);
		this.hoursWorked = hoursWorked;
		this.wage = wage;
	}
	
	@Override
	public double calculatePay() {
		return hoursWorked * wage;
	}

	public double getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public double getWage() {
		return wage;
	}

	public void setWage(double wage) throws InvalidWageException {
		if(wage == 0) {
//			throw new IllegalArgumentException("with cause", new Throwable().getCause());
			throw new IllegalArgumentException("Invalid Number");
		} else if(wage<7.25) {
			throw new InvalidWageException("Get a new job.");
		} else {
			this.wage = wage;
		}
		
	}

	@Override
	public String toString() {
		return "HourlyEmployee [hoursWorked=" + hoursWorked + ", wage=" + wage + ", getId()=" + getId() + ", getName()="
				+ getName() + ", getManager()=" + getManager() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(hoursWorked, wage);
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
		HourlyEmployee other = (HourlyEmployee) obj;
		return Double.doubleToLongBits(hoursWorked) == Double.doubleToLongBits(other.hoursWorked)
				&& Double.doubleToLongBits(wage) == Double.doubleToLongBits(other.wage);
	}
	
	
	
	
}