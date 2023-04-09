package com.composite;
import java.util.*;

//composite class
public class Drawing implements Shape{
	
	private List<Shape> shapes;
	
	public Drawing() {
		shapes = new ArrayList<>();
	}
	
	public void addShape(Shape shape) {
		shapes.add(shape);
	}
	
	public void removeShape(Shape shape) {
		shapes.remove(shape);
	}
	
	public void clearShapes() {
		shapes.clear();
	}
	
	@Override
	public void draw(String color) {
		for(Shape shape: shapes)
			shape.draw(color);
	}

}
