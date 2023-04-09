package com.factory_method;

public abstract class VehicleFactory {
	
	public Vehicle getVehicle() {
		Vehicle vehicle = createVehicle();
		return vehicle;
	}
	
	public abstract Vehicle createVehicle();
}
