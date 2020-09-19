package com.syntax.class08;

public class BreakAndContinue {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			if (i==10) {
				System.out.println("I am stopping the loop");
				break;
			}
			System.out.println(i);
		}			

		System.out.println("We are outside of the loop");

		System.out.println("----CONTINUE----");
		for (int i = 1; i <= 10; i++) {

			if (i == 4) {
				System.out.println("I am skipping");
				continue;
			}

			System.out.println(i);
		}

		System.out.println("We are outside of the loop");

	}
	}
