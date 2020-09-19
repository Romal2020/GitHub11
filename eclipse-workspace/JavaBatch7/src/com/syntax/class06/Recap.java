package com.syntax.class06;

public class Recap {

	public static void main(String[] args) {
		int hour =23;
		String dayTime;
		if (hour >= 1 && hour <= 11) {
			dayTime = " morning";
		} else if (hour >= 12 && hour <= 15) {
			dayTime = "afternoon";
		} else if (hour >= 16 && hour <= 20) {
			dayTime = "evening";
		} else if (hour >= 21 && hour <= 24) {
			dayTime = "night";
		} else {
			dayTime = "unknown";
		}
		if (!dayTime.equalsIgnoreCase("Unknown")) {
			System.out.println("Right now it is " + dayTime);
		}
	}
}

