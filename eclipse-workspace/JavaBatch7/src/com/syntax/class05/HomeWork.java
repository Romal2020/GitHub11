package com.syntax.class05;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean cc;
		System.out.println("Do you have a credit card?(true or false)");
		cc = scan.nextBoolean();
		if (cc) {
			System.out.println("What is your Credit Card balance?");
			double balance = scan.nextDouble();
			if (balance > 1000) {
				System.out.println("PLease pay off immediatly!");
			} else {
				System.out.println("You can spend more");
			}
		} else {
			System.out.println("Let me offer you our best credit card!");
		}

	}

}
