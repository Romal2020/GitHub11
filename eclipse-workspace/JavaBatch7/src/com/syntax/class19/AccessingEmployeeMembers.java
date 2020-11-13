package com.syntax.class19;

public class AccessingEmployeeMembers {

	public static void main(String[] args) {
		
		
		Employee emp=new Employee();
		emp.lastName="Oliva";//accessing public variables within different package 
		emp.name="Luis";//accessing public variables within different package
		
//		emp.age --> protected not visible within different package
//		emp.salary--> default not visible within different package
//		emp.ssn--> private not visible within different package
		
		emp.displayName();//public method

	}

}
