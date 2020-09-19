package com.syntax.class07;

public class IncrementDecrement {

	public static void main(String[] args) {
//		int x = 10;
//		x = x + 1;
//		x += 1;
//		// another way to add 1 into the VARIABLE
//		x++; // post-increment
//		++x; // pre-increment
//
//		System.out.println(x);
//
//		int y = 50;
//		y = y - 1;
//		y -= 1;
//		y--;
//		System.out.println(y);
//
//		System.out.println(--y);

		// 3++; // compiler error
		// 3--; // compiler error
		int z = 5;
		if (++z == 6) {
			System.out.println("Hi there!");
		}
		System.out.println(z);
		int k = 10;
		if (k++ == 11) {
			System.out.println("Nail was here!");
		}
		System.out.println(k);
		int m = 5;
		m += 2;
		System.out.println(m);
	}

}
