package com.skillstorm;

public class TestEmployees {
	
	public static void main(String[] args) {
		SalaryEmployee employee1 = new SalaryEmployee(1, "Darrell", null, 30000);
		HourlyEmployee employee2 = new HourlyEmployee(2, "Jim", employee1, 40, 7.25);

		System.out.println(employee1);
		try {
			employee1.setSalary(29000);
		} catch (InvalidSalaryException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(employee2);
		try {
			employee2.setWage(0);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} catch (InvalidWageException e) {
			System.out.println(e.getMessage());
		} 
		
		
	}

}