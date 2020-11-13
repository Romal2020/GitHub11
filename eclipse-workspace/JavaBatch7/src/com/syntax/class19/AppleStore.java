package com.syntax.class19;

public class AppleStore {

	public static void main(String[] args) {
		//Iphone.touchScreen=false;
		Iphone phone1=new Iphone();
		phone1.model="11 pro";
		phone1.memory=256;
		phone1.color="Blue";
		phone1.price=1000;
		phone1.displayDetails();
		//phone1.displayInfo();--> possible but not prefferable way
				Iphone.displayInfo();//calling static method
				
				Iphone.touchScreen=false;//accessing static variable
				
				System.out.println("---- 2 iPhone object ------");
				Iphone phone2 =new Iphone();
				phone2.model="11";
				phone2.memory=64;
				phone2.color="Pink";
				phone2.price=900;
				phone2.displayDetails();
				Iphone.displayInfo();
				
				System.out.println("-------  Calling info method again -------");
				phone1.displayInfo();

	}

}
