package com.syntax.class35;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please write any number");
		try {
			int num = scan.nextInt();
			System.out.println(num);
		} catch (InputMismatchException ime) {
			System.out.println(ime);
		}

	}

}
