package com.syntax.class21;

public class AnimalsTset {

	public static void main(String[] args) {
		//object of parent class has an access to all var and methods of it is own class ONLY
		Animal a =new Animal();
		a.breed="Something";
		a.color="grey";
		a.paws=4;
		a.sleep();
		a.eat();
		
		//object of child class has an access to all var methods of it is parent and it is own class
		Dog dog= new Dog();
		dog.breed="Husky";
		dog.color="Yellow";
		dog.paws=4;
		dog.tail=true;
		dog.eat();
		dog.sleep();
		dog.bark();
		
	}

}
