package com.syntax.class04;

import java.util.Scanner;

public class ScannerIfElse {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("PLease enter a number!");
		int num1 = scan.nextInt();
		System.out.println("PLease enter a other number!");
		int num2 = scan.nextInt();
		System.out.println("_-----___-----___");
		System.out.println("Numbers are " + num1 + " and " + num2);

		if (num1 > num2) {
			System.out.println(num1 + "Is larger than " + num2);
		} else if (num1 < num2) {
			System.out.println(num1 + " Is smaller than " + num2);
		} else {
			System.out.println(num1 + " Is equal to " + num2);
		}

	}

}
