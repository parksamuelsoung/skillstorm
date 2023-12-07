package com.skillstorm;

import java.util.Objects;

public abstract class Employee {
	
	private long id = 1;
	private String name = "Name";
	private Employee manager = null;
	
	public Employee() {
		
	}
	
	public Employee(long id, String name, Employee manager) {
		this.id = id;
		this.name = name;
		this.manager = manager;
	}	
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee getManager() {
		return manager;
	}

	public void setManager(Employee manager) {
		this.manager = manager;
	}

	/*
	 * Calculates the pay for the current period.
	 */
	abstract double calculatePay() throws InvalidPayException;

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", manager=" + manager + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, manager, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id && Objects.equals(manager, other.manager) && Objects.equals(name, other.name);
	}
		

}