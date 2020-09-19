package com.syntax.class06;

import java.util.Scanner;

public class Homework1WithSwitch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your birth month:");
		String month = scan.next();
		String season;
		switch (month.toLowerCase()) {
		case "desember":
		case "january":
		case "february":
			season = "Winter";
			break;
		case "march":
		case "april":
		case "may":
			season = "Spring";
			break;
		case "june":
		case "july":
		case "august":
			season = "Summer";
			break;
		case "september":
		case "october":
		case "november":
			season = "Fall";
			break;
			default :
			season = "Unkown";

		}
		System.out.println("You were born in " + season);

	}

}
