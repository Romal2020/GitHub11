package com.syntax.class09;

public class Pattrens {

	public static void main(String[] args) {
		System.out.println("Silly way , not nested loop");
		for (int i = 1; i <= 4; i++) {
			System.out.println("*****");
		}
		System.out.println("Another silly way ");
		for (int i = 1; i <= 5; i++) {
			System.out.println("*");
		}
		System.out.println();
		System.out.println("-----1st way---------");
		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("------2nd way--------");
		for (int i = 4; i >= 1; i--) {
			for (int j = 101; j <= 105; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-------Task pattern 10X10-------");
		for (int row = 1; row <= 10; row++) {
			for (int col = 1; col<=10;col++) {
				System.out.print("$");
			}
			System.out.println();
		}
			
	}
}