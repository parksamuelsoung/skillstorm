package com.skillstorm.groupwork;

public class TestCourses {
	
	public static void main(String[] args) {
		// Wreaking havoc
		Course course = new Course("Java Vettec 20231113");
		Student student1 = new Student("Saugat");
		student1.setGpa(5.0);
		student1.addCourse(course);
		
		course.enroll(student1);
		
		System.out.println(student1.toString());
		
	}

}