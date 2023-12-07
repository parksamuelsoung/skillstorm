package com.skillstorm;

import java.util.Objects;

public class SalaryEmployee extends Employee {
	private double salary;
	
	public SalaryEmployee() {
		
	}
	
	public SalaryEmployee(long id, String name, Employee manager, double salary) {
		super(id, name, manager);
		this.salary = salary;
	}
	
	// TODO 5 override calculate pay
	@Override
	public double calculatePay() {
		return 0;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) throws InvalidSalaryException {
		if(salary<30000) {
			throw new InvalidSalaryException("Get a new job.");
		} else {
			this.salary = salary;
		}
		
	}

	@Override
	public String toString() {
		return "SalaryEmployee [salary=" + salary + ", getId()=" + getId() + ", getName()=" + getName()
				+ ", getManager()=" + getManager() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(salary);
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
		SalaryEmployee other = (SalaryEmployee) obj;
		return Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}
	
	
	
	
}