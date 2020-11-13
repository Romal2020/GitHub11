package com.syntax.class19;


public class AccessingEmployeeClassMembers {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.name="Gozde";
		emp.lastName="Doe";
		emp.age=30;//accessing protected within same package
		emp.salary=100000;//accessing default within same package
	//	emp.ssn-->wont be available because it is private
		
		emp.displayName();
		emp.displayAge();
		emp.displaySalary();
		//emp.displaySsn();wont be available because it is private

	}

}
