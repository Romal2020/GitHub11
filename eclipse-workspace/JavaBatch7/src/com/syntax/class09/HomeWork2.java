package com.syntax.class09;

import java.util.Scanner;

public class HomeWork2 {
// shopping 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double money;
		double totalAmount = 0;
		double remainingBalance;
		double change;
		 
		System.out.println("Please enter the item that you want to buy!");
		String item = scan.nextLine();
		System.out.println("Please enter the price:");
		double price = scan.nextDouble();

		do {
			System.out.println("Please give me the payment!");
			money = scan.nextDouble();
			totalAmount += money;
			
			if(totalAmount < price) {
				remainingBalance = price - totalAmount;
				System.out.println("You should give this much more money: "+ remainingBalance);
			} else if (totalAmount > price) {
				change = totalAmount - price;
				System.out.println("Your change is "+ change);
			} else {
				System.out.println("Maan, you gave exactly what you owed me!");
			}
		}while(totalAmount < price);
		System.out.println("Thank you for shopping!");
	}

}
