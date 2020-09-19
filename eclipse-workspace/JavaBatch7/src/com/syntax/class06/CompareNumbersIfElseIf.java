package com.syntax.class06;

import java.util.Scanner;

public class CompareNumbersIfElseIf {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the first number:");
		double a = scan.nextDouble();
		System.out.println("Please enter the second number:");
		double b = scan.nextDouble();
		System.out.println("Please enter the third number:");
		double c = scan.nextDouble();
		double largest;
		if(a>b&& a >c ) {
			largest = a;
		} else if (b >a && b>c) {
			largest = b;
		} else if (c>a && c>b) {
			largest = c;
			System.out.println("Largest number is "+largest);
		}
		if(a>b&&b>c) {
			largest = a;
		} else if (b>c) {
			largest =b ;
		} else {
			largest = c;
			System.out.println("Largest number is "+largest);
		}

	}

}
