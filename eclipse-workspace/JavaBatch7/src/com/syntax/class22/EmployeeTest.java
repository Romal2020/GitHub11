package com.syntax.class22;

public class EmployeeTest {

	public static void main(String[] args) {
		ScrumTeam obj1 = new ScrumTeam();
		ScrumTeam.companyName = "Facebook";
		obj1.fullName = "John DOe";
		obj1.salary= 120000;
		obj1.getPaid();
		obj1.work();
		
		obj1.attendMeetings();
		obj1.ceremonies = "Scrum meetings";
		obj1.workBuildingSoft();
		
		ProductOwner obj2 = new ProductOwner();
		obj2.ceremonies = "Scrum meetings";
		obj2.attendMeetings();
		obj2.workBuildingSoft();
		
	    obj2.communicate();
	}

}
