package com.syntax.class14;

public class StringDifference {

	public static void main(String[] args) {

		String name="Neil";
		String name1=new String ("Neil");
		System.out.println(name);
		System.out.println(name1);
		if(name.equals(name1)) {
			System.out.println("Strings are equal using equlas method ");
		}
		if(name==name1) {
			System.out.println("String are equal using == operator ");
		}
		String name2="Neil";
		if(name1==name2) {
			System.out.println("2 String are equal");
		}

	}

}
