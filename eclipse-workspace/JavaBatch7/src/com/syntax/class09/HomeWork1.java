package com.syntax.class09;

import java.util.Scanner;

public class HomeWork1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int start;
		int end;
		int sumOdd = 0;
		int sumEven = 0;
		int total = 0;
		System.out.println("Please enter a starting number:");
		start = scan.nextInt();
		System.out.println("Please enter a ending number:");
		end = scan.nextInt();
		for(int i= start; i<=end; i++) {
			if(i%2 ==0) {
				sumEven += i;
			} else {
				sumOdd += i;
			}
		}

		System.out.println("The sum of even numbers is " + sumEven);
		System.out.println("The sum of Odd numbers is " + sumOdd);
		total = sumEven +sumOdd;
		System.out.println("The sum of all numbers is " + total);
	}

}
