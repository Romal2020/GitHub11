package com.syntax.class35;

public class CatchingException {

	public static void main(String[] args) {
		int a = 10;
		int b =20;
		
		try {
			System.out.println(a/b);
		} catch(Exception ae) {
			ae.printStackTrace();
			System.out.println(ae.getMessage());
		}
System.out.println("End of the code");
	}

}
