package com.decorator;

public class Main {
	
	public static void main(String[] args) {
		
		//decorator design pattern
		//Decorator design pattern is helpful in providing runtime 
		//modification abilities and hence more flexible
		//it's easy to maintain and extend when the number of choices are more.
		//surrounding various decorators as wrappers around the original
		//object
		
		Car car1 = new LuxuryCar(new BasicCar());
		car1.assemble();
		
		Car car2 = new SportsCar(new LuxuryCar(new BasicCar()));
		car2.assemble();
	}
}
