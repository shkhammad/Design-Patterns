package com.decorator;

//sub-types of decorator class
public class LuxuryCar extends CarDecorator{
	
	public LuxuryCar(Car car) {
		super(car);
	}
	
	@Override
	public void assemble() {
		super.assemble();
		System.out.println("Added features of luxury car");
	}
}
