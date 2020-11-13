package com.syntax.class24;

public class Employee {

	double salary;
	void getPaid() {//overriden
		System.out.println("Employee gets paid salary ="+salary);	
	}
}
class Contractor extends Employee{
	double hourlyRate;
	void getPaid() {
		System.out.println("Contractor gets paid hourly rate="+hourlyRate);
	}
}
class FulltimeEmployee extends Employee{
	
}