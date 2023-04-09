package com.template_method;

public class Test {
	
	public static void main(String[] args) {
		
		//template-method pattern
		//The template method is best used when you can generalize
		//between two classes into a new superclass. Think of it as
		//another technique to use when you notice you have two
		//separate classes with very similar functionality and order of
		//operations. You can choose to use a template method, so
		//changes to these algorithms only need to be applied in one
		//place instead of two. The template method would be within the
		//superclass, and would therefore be inherited by the subclasses.
		
		House house1 = new GlassHouse();
		house1.buildHouse();

		System.out.println("**********");
		
		House house2 = new WoodenHouse();
		house2.buildHouse();
		
		
	}
}
