package com.factory_method;

public class CarFactory extends VehicleFactory{
	
	@Override
	public Vehicle createVehicle() {
		return new Car();
	}
}
