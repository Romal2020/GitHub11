package com.syntax.class04;

public class NestedElseIf {

	public static void main(String[] args) {
	boolean completed = true;
	if (completed) {
		int score = 82;
		if ( score>= 90) {
			System.out.println("A, Great job!");
		} else if (score>=80) {
			System.out.println("B, WellDone!");
		} else if (score >= 70) {
			System.out.println("C, Just passed!");
		} else {
			System.out.println("F, You failed");
		}
			
	}

	}

}
