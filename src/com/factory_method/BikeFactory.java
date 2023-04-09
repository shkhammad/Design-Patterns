package com.factory_method;

public class BikeFactory extends VehicleFactory{
	
	@Override
	public Vehicle createVehicle() {
		return new Bike();
	}
}
