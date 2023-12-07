package com.skillstorm.groupwork;

public class Student {
	
	private String name;
	private double gpa;
	private Course[] courses;
	private static int MAX_NUM_COURSES = 30;
	private int numberOfCourses;
	
	public Student(String name) {
		this.name = name;
		this.courses = new Course[MAX_NUM_COURSES];
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public static int getMAX_NUM_COURSES() {
		return MAX_NUM_COURSES;
	}


	public int getNumberOfCourses() {
		return numberOfCourses;
	}
	
	public void addCourse(Course course) {
		this.courses[numberOfCourses] = course;
		numberOfCourses++;
	}
	
	public void removeCourse(Course course) {
		for (int i = 0; i < numberOfCourses; i++) {
			if (courses[i] == course) {
				courses[i] = courses[numberOfCourses - 1];
				courses[numberOfCourses - 1] = null;
				break;
			}
		}
		
		numberOfCourses--;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ",GPA=" + gpa + ",numberOfCourses=" + numberOfCourses + "]";
	}
	
}
