package com.syntax.class07;

public class Task1 {
	public static void main(String[] args) {
		int x=1;
		while(x<20) {
			if(x%2==1) {
				System.out.println(x);
			}
			x++;
		System.out.println("===========");
		int y=1;
		while(y<=20) {
			System.out.println(y);
			y+= 2;
		}
		System.out.println("===========");
		int z=0;
		while(z<20) {
			z++;
			System.out.println(z);
		}
		System.out.println("===========5");
		int g = 0;
		while(g<20) {
			System.out.println(++g);
			g++;
		}
	}
}
}
