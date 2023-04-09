package com.decorator;

//sub-types of decorator class
public class SportsCar extends CarDecorator{
	
	public SportsCar(Car car) {
		super(car);
	}
	
	@Override
	public void assemble() {
		super.assemble();
		System.out.println("Added features of sports car");
	}
}
