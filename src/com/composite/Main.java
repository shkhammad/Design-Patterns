package com.composite;

public class Main {

	public static void main(String[] args) {
		
		//composite design pattern
		//Composite pattern should be applied only when the group of objects (Circle,Triangle) should 
		//behave as the single object (via Drawing).
		//Composite design pattern can be used to create a tree like structure.
		
		Shape circle1 = new Circle();
		Shape triangle1 = new Triangle();
		
		Drawing drawing1 = new Drawing();
		
		drawing1.addShape(circle1);
		drawing1.addShape(triangle1);
		
		drawing1.draw("red");
		
		drawing1.removeShape(triangle1);
		drawing1.draw("green");
		
		
		Drawing drawing2 = new Drawing();
		
		drawing2.addShape(circle1);
		drawing2.addShape(triangle1);
		drawing2.addShape(drawing1);
	
		drawing2.draw("golden");
		
		drawing1.clearShapes();
		drawing2.clearShapes();
	}	

}
