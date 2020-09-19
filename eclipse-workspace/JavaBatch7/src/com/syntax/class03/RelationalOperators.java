package com.syntax.class03;

public class RelationalOperators {

	public static void main(String[] args) {
		int a = 7;
		int b = 10;
		System.out.println(3 > 4);

		System.out.println(a > b);
		System.out.println(a < b);
		System.out.println(a == b);
		System.out.println(a != b);
		System.out.println("-----------");
		double i = 10.78;
		double j = 10.78;
		boolean result1 = i > j;
		System.out.println(result1);
		boolean result2 = i == j;
		System.out.println(result2);
		boolean result3 = (i != j);
		System.out.println(result3);
		boolean result4 = i >= j;
		System.out.println(result4);
		boolean result5 = i <= j;
		System.out.println(result5);
	}

}
