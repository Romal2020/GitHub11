package com.syntax.class09;

public class MorePatterns {

	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.println(j);
			}
			System.out.println();
		}
		System.out.println("=======");
		for (int row = 1; row <= 4;row++) {
			for (int col = 11; col <= 15; col++) {
				System.out.print(row);
			}
		System.out.println();
	}

}
}