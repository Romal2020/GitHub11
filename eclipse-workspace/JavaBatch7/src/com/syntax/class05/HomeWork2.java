package com.syntax.class05;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your number of working year!");
		int year = scan.nextInt();
		if(year >=5) {
			System.out.println("You are eligible for the bonus!");
			System.out.println("Please enter your annual salary!");
			double salary = scan.nextDouble();
			if(salary >5000) {
				System.out.println("Your bonus is 5000");
			} else {
				System.out.println("Your bonus is 3000");
			}
		}
		else {
			System.out.println("You are NOT eligible for the bonus!");
		}
	}

}
