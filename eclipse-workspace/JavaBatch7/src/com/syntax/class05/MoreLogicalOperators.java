package com.syntax.class05;

public class MoreLogicalOperators {

	public static void main(String[] args) {
		int day = 5;
		if (day == 2 || day == 4) {
			System.out.println("SDLC class");
		} else if (day == 6 || day == 7) {
			System.out.println("JAva class ");
		} else if (day == 1 || day == 5) {
			System.out.println("No class");
		} else if (day == 3) {
			System.out.println("Review class ");
		} else {
			System.out.println("wrong day");
		}
		String day2 = "Saturday";
		if (day2.equals("Tuesday") || day2.equals("Thursday")) {
			System.out.println("SDLC class");
		} else if (day2.equals("Saturday") || day2.equals("Sunday")) {
			System.out.println("Java class");
		} else if (day2.equals("Monday") || day2.equals("Friday")) {
			System.out.println("No class");
		} else if (day2.equals("Wednesday")) {
			System.out.println("Review class");
		} else {
			System.out.println("Wrong day");
		}
	}
}