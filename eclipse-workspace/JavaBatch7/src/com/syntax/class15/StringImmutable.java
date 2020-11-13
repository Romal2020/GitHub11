package com.syntax.class15;

public class StringImmutable {

	public static void main(String[] args) {
		String str = "today is a good day ";// new object gets created

		str = str.replace("good", "amazing");// new object gets created and that object is assigned to str
https://github.com/SyntaxTechnologies/JavaBatch7/blob/master/com/syntax/class15/Task.java
		System.out.println(str);
		str.concat(".I Lve sundays");
		System.out.println(str);
		str.toUpperCase();
		System.out.println(str);

		String str1 = new String("Hello");
		str1.toUpperCase();
		System.out.println("Value of str1 =" + str1);
		String str2 = "Hello";
		String str3 = "Hello";
		String str4 = "Hello";

		str2.toUpperCase();
		System.out.println("Value of str2 if we did not assign it=" + str2);

		str2 = str2.toLowerCase();
		System.out.println("Value of str2 if we did not assign it=" + str2);
		
		System.out.println("Value of str 3=" + str3);
		System.out.println("Value of str 4=" + str4);

		String str5 = new String("Hello");

	}

}
