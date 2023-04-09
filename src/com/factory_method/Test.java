package com.factory_method;

public class Test {
	
	public static void main(String[] args) {
		
		//factory method design-pattern
		//Factory design pattern provides approach to code for interface 
		//rather than implementation
		//Factory pattern removes the instantiation of actual implementation 
		//classes from client code
		new CarFactory().getVehicle().build();
		new BikeFactory().getVehicle().build();
		
	}
}
