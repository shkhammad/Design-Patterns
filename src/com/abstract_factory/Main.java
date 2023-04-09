package com.abstract_factory;

public class Main {
	
	public static void main(String[] args) {
		
		//abstract factory design-pattern
		//This pattern is commonly used when we start using 
		//the Factory Method Pattern, and we need to evolve our 
		//system to a more complex system and it is applied over
		//a class and also uses delegation (an object 
		//forwards a task or responsibility to another object to 
		//perform on its behalf.)
		
		Showroom showroom1 = new HummerFactory();
		showroom1.getMotorVehicle().build();
		showroom1.getElectricVehicle().build();
		
		Showroom showroom2 = new TeslaFactory();
		showroom2.getMotorVehicle().build();
		showroom2.getElectricVehicle().build();
				
		
	}
}
