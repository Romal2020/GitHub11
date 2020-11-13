package com.syntax.class15;

public class HW1 {

	public static void main(String[] args) {
		// Create a String and if the String is not empty perform the following:
		// if the String has an odd number of characters and has 3 or more characters,
		// print the character in the middle of the String.
		String str = "ABb";
		int size = str.length();// 3
		if (!str.isEmpty()) {
			if (size >= 3) {
				if (size % 2 != 0) {
					int print = (size / 2);// 3/2=1
					System.out.println(str.charAt(print));
				} else {
					System.out.println("This string has an even number of charactoers");
				}
			} else {
				System.out.println("This String has less than 3 characters");
			}
		}
	}

}
