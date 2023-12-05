package com.skillstorm;

public class ProgrammerTest {

	public static void main(String[] args) {
		Programmer programmer1 = new Programmer();
		Programmer programmer2 = new Programmer();
		
		programmer1.setName("Gilbert");
		programmer1.setCompany("Company1");
		programmer1.learnLanguage("Java");
		programmer1.learnLanguage("Python");
		programmer1.learnLanguage("C++");
		System.out.println(programmer1);
		
		System.out.println();
		programmer1.deleteLanguage("C++");
		System.out.println(programmer1);
		
		System.out.println();
		programmer2.setName("Nicolas");
		programmer2.setCompany("Company2");
		programmer2.learnLanguage("Java");
		programmer2.learnLanguage("Python");
		System.out.println(programmer2);
		
		System.out.println();
		System.out.println(programmer1.equals(programmer2));
		
	}
}
