package com.syntax.class22;

public class WaterFallTeam extends Employee{

	public static void main(String[] args) {

		WaterFallTeam wt = new WaterFallTeam();
		WaterFallTeam.companyName="Google";
		wt.fullName= "John Snow";//protected variable is accessible to different class through inheritance
		System.out.println(wt.fullName);
		Employee emp = new Employee();
		

	}

}