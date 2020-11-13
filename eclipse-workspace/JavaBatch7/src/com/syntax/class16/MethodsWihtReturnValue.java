package com.syntax.class16;

public class MethodsWihtReturnValue {

	public static void main(String[] args) {

		// create a String and based and on the number of character define whether
		// String is long or short
		// long if length >10, short if less
		String str ="I Love JAva";
		int length = str.length();
		if(length >= 10) {
			System.out.println("created string is long");
		} else {
			System.out.println("Created String is short");
		}
		//identify which number is the largest and then define whether this largest number if even or odd
		TaskMethods obj = new TaskMethods();
		obj.larger(10, 20);
	}
	//create a method that will RETURN the largest number
	int largest(int a, int b ) {
		int largest;
		if(a>b) {
			largest=a;
		} else {
			largest = b;
		}
		return largest;
	}

}
