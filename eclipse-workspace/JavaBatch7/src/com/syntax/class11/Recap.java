package com.syntax.class11;

public class Recap {

	public static void main(String[] args) {
		int[] grades = new int[5];
		int size = grades.length;
		System.out.println("array size is :" + size);
		grades[4] = 90;
		grades[3] = 85;
		grades[2] = 92;
		grades[1] = 75;
		grades[0] = 100;
		// what is the average of the class?
		// 1st silly way
		int average = (grades[0] + grades[1] + grades[2] + grades[3] + grades[4]) / size;
		System.out.println("class average is: " + average);

		// 2nd best way
		int total = 0;
		for (int k = 0; k < size; k++) {
			total += grades[k];
		}
		System.out.println("class average is: " + total / size);
		System.out.println("----------------------------");
		String[] cities = { "Faifax", "Kiev", "Tampa", "Washington", "Arlington", "NYC", "LOrton", "Chicago" };
		System.out.println("I Live in " + cities[3]);
		int i = 1;
		System.out.println("I live in "+ cities[i]);
		i+=2;
		System.out.println("I live in "+ cities[i]);
		int cityLength = cities.length;
		System.out.println("The last city in the list is:" +cities[cityLength - 1]);
		System.out.println("----------------------------");
		//I want to print all the cities
		for(int j = 0; j<cities.length;j++) {
			System.out.println(cities[j]);
		}
	}

}
