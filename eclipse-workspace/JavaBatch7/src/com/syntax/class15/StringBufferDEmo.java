package com.syntax.class15;

public class StringBufferDEmo {

	public static void main(String[] args) {

		StringBuffer strBuffer = new StringBuffer("Hello");// is a mutable object
		strBuffer.append("friends");
		System.out.println(strBuffer);
		String str2 = "Hello";
		str2.concat("friends");
		System.out.println(str2);
		
	}

}
