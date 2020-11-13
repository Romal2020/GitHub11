package com.syntax.class19;

public class Iphone {

	static String brand = "Apple";
	static String OS = "iOS";
	static boolean touchScreen = true;
	String model;
	int memory;
	double price;
	String color;

	static void displayInfo() {
		System.out.println("iphone belongs to brand " + brand + " and it has OS as " + OS
				+ " and alliphones have touchScreen=" + touchScreen);
	}
//		static void displayDetails() { static methods cannot access instance/non static members/variables
//			System.out.println("We build iPhone "+model+" with memory ="+memory+" in "+color+" color for price =$"+price);
		//
	void displayDetails(){
		System.out.println("We build iPhone " + model + " with memory =" + memory + " in " + color
				+ " color for price =$" + price);
	}
	void displayInfo1() {
		System.out.println("iphone belongs to brand "+brand+ "and it has OS as "+OS+ " and all iphones have touchScreen="+touchScreen);
		
	}

	}
