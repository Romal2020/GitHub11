package com.syntax.class18;

public class LocalVariables {
	public static void main(String[] args) {

		String name="Mohammad";// local to main method and it's scope only within main method 
		for(int i=1; i<=5;i++) {
			System.out.println("Today is a jave class");
			System.out.println(i);
		}
		//System.out.println(i);CE: i cannot be resolved to a variable
		//String name="Ali"; //duplicate variable declaration
		int a;//declare
		for(a=0;a<=3;a++) {
			System.out.println(a);
		}
		System.out.println(a);
	}
	void dispalyName() {
//		System.out.println(name); CE: name cannot be resolved to a variable
//		name is not visible to the displayName methods because it local to main
	}
	//create a method to return sum of 2 numbers
	int sum(int num1, int num2) { //num1 and num2 local variables to method sum
		return num1+num2;
	}
	double div(double num1, double num2) {
		return num1/num2;
	}
	
}
