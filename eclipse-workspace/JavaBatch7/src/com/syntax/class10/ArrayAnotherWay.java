package com.syntax.class10;

public class ArrayAnotherWay {
	public static void main(String[] args) {
		String[] weekdays = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" };
		System.out.println(weekdays[3]);
		weekdays[3] = "Thursday";
		System.out.println(weekdays[3]);
		// 1st way
		double[] balances = { 1000, 23.50, 5540.5 };
		System.out.println("total money is:" + (balances[0] + balances[1] + balances[2]));
		// 2nd way
		int total1 = (int) balances[0] + (int) balances[1] + (int) balances[2];
		System.out.println("total1 is:" + total1);
		//3rd way
		int total2 =(int) (balances[0] +balances[1]+ balances[2]);
		System.out.println("total2 is :"+total2);
		
//		int[]numbers1 = new int[0];
//		int []numbers2 = {};
//		numbers2[0] = 5;
//		System.out.println(numbers2[0]);
	}
}
