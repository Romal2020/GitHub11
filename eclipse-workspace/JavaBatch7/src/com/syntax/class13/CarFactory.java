package com.syntax.class13;

public class CarFactory {

	public static void main(String[] args) {
		//building an object of the car 
		Car car1 =new Car();
		car1.make="Tesla";
		car1.model="X";
		car1.color="Red";
		car1.year=2020;
		car1.speed=200;
		System.out.println("Make of 1 car is "+car1.make+" and model is "+car1.model+" and it is in "+car1.color+" color");
		
		System.out.println("--- Accessing methods from Car class using car1 --- ");
		car1.drive();car1.reverse();
		car1.transportPeople();
		//building an object of the car 
		Car car2 = new Car();
		car2.make="BMW";
		car2.model="M5";
		car2.color="Blue";
		car2.year=2020;
		car2.speed=200;
		System.out.println("Make of car 2 is "+ car2.make);
		System.out.println("--- Accessing methods from Car class using car2 --- ");
		
		car2.drive();
		car2.reverse();
		car2.transportPeople();
	}

}
