package com.syntax.class20;

public class BetterCarTest {

	public static void main(String[] args) {

		BetterCar car = new BetterCar("X5", "Red", 2020, 8000);
		car.displayInfo();
		BetterCar car1 = new BetterCar("Model S", "silver", 2019, 9000);
		car1.displayInfo();
		// new BetterCar(); CE: because we do not have a non argument constructor inside
		// BetterCar class
	}

}
