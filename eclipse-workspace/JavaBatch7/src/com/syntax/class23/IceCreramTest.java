package com.syntax.class23;

public class IceCreramTest {

	public static void main(String[] args) {
		
		Gelato g = new Gelato("strawberry", "br", "pink");
		g=new Gelato("mint", "magnum", "green");
		new MiniSorbeto("chocolate", "br", "brown", 2.49, 150);

		System.out.println(g);
	}
}