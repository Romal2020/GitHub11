package com.syntax.class08;

public class HomeWrok {

	public static void main(String[] args) {
//		for (int i = 100; i >= 1; i--) {
//			// int j = 5;
//			System.out.print(i + ", ");
//
//		}
//		for (int i = 1; i <= 3; i++) {
//			System.out.println(i + ", ");
//		}
//		for (int i = 20; i <= 50; i++) {
//			if (i % 2 == 1) {
//				System.out.println(i);
//			}
		for (int j = 5; j > 0; j--) {
			System.out.println(j);
		}
		int total = 1;
		for (int k = 1; k <= 4; k++) {
			System.out.println(k);
			total = total + k;
		}
		System.out.println("total is " + total);
	}
}
