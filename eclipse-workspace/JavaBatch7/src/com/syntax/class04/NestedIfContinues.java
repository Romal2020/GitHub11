package com.syntax.class04;

public class NestedIfContinues {

	public static void main(String[] args) {
		boolean allergies = true;
		boolean peanut = true;
		boolean lactose = false;
		boolean bee= true;
		if(!allergies) {
			System.out.println("You are healthy");
		}  if (peanut) {
			System.out.println("Don't eat peanut!");
		}  if (lactose) {
			System.out.println("Don't drink milk!");
		}if (bee) {
			System.out.println("Don't mess with bees");
		}
				

	}

}
