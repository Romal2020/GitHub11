package com.syntax.class04;

public class MoreNestedIf {

	public static void main(String[] args) {

		boolean isFriday = true;
		int date = 23;
		if (isFriday) {
			System.out.println("it's Friday. I am going to watch movie !");
		} else {
			System.out.println("It's not Friday. I am going to study JAVA!");
			if (date == 13) {
				System.out.println("I am not going to school");
			} else {
				System.out.println("I am going to school");

			}
		}

	}
}