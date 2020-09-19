package com.syntax.class07;

import java.util.Scanner;

public class ScannerAndLoop {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 1;
		do {
			System.out.println("Please enter your name:");
			String name = scan.nextLine();
			System.out.println("Good afternoon "+ name);
			num++;
		} while (num<=5);
		int num2 =1;
		while (num2 <= 5) {
			System.out.println("Please enter uour name:");
			String name=scan.nextLine();
			System.out.println("Good Afternoon " + name);
			num2++;
		}

	}

}
