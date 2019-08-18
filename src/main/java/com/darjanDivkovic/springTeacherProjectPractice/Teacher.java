package com.darjanDivkovic.springTeacherProjectPractice;


public class Teacher {

	// Data fields
	 String name;
	 String surname;
	double salary;
	
	// Constructors
	Teacher(){}
	
	Teacher(String name, String surname, double salary){
		this.name = name;
		this.surname = surname;
		this.salary = salary;
	}

	// Get & Set
	
	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public double getSalary() {
		return salary;
	}

	
	// To String
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", surname=" + surname + ", salary=" + salary + "]";
	}
	
}
