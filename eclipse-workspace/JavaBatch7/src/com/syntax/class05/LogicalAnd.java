package com.syntax.class05;

public class LogicalAnd {

	public static void main(String[] args) {
		int num = 500;
		if (num >= 1 && num <= 10) {
			System.out.println(num + " is a small number");
		} else if (num > 10 && num <= 100) {
			System.out.println(num + " is a medium number");
		} else if (  num>100&& num <=1000) {
			System.out.println(num + " is a large number");
		} else {
			System.out.println(num + " is out of range");
		}
	}

}
