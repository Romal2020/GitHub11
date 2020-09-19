package com.syntax.class05;

public class LogicalNot {

	public static void main(String[] args) {
//		boolean b1 = !true;
//		System.out.println(b1);
//		boolean b2 =!false;
//		System.out.println(b2);
//		boolean cold = true;
//		if(!cold) {
//			System.out.println(1);
//		} else {
//			System.out.println(2);
//		}
		int day = 1;
	if(day != 1 && day != 5) {
		System.out.println("We have a class");
	} else {
		System.out.println("WEare sleeping ");	
	}
	System.out.println("=============");
	
	if(!(day == 1 || day == 5)) {
		System.out.println("We have a class");
	} else {
		System.out.println("We are sleeping ");
	}
	System.out.println("=============");
	boolean isRaining = false;
	if(!isRaining) {
		System.out.println(1);
	} else {
		System.out.println(2);
	}
}}


