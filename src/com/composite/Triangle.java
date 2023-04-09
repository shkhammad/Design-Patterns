package com.composite;

//leaf class
public class Triangle implements Shape{

	@Override
	public void draw(String color) {
		System.out.println("Drawing a " + color + " triangle");
	}
	
}
