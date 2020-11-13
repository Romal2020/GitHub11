package com.syntax.class12;

public class Task {

	/*
	 * create a 2D that will store food of different kinds and retrieve all values
	 * from that array using 2 different loops lets create an 2D array of int and
	 * calculate sum of all odd numbers
	 */

	public static void main(String[] args) {
		int[][] numbers = { { 10, 23, 56, 47 }, { 33, 668, 89 }, { 2, 9, 0 } };
		// regular for loop
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				int element = numbers[i][j];
				if (element % 2 != 0) {
					sum += element;
				}
			}
			System.out.println(sum);
		}
	}

}
