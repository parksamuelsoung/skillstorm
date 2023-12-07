package com.skillstorm;

import java.util.Objects;

public class Person {
	
	private String name;
	private Vehicle vehicle;
	
	public Person(String name, Vehicle vehicle) {
		this.name = name;
		this.vehicle = vehicle;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	void commute() {
		vehicle.go();
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", vehicle=" + vehicle + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, vehicle);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(name, other.name) && Objects.equals(vehicle, other.vehicle);
	}
	
	

}