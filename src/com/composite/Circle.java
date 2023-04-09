package com.composite;

//leaf class
public class Circle implements Shape{
	
	@Override
	public void draw(String color) {
		System.out.println("Drawing a " + color + " circle");
	}
}
