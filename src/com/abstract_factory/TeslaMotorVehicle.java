package com.abstract_factory;

public class TeslaMotorVehicle implements MotorVehicle{
	
	@Override
	public void build() {
		System.out.println("Building Tesla-Motor-Vehicle... ");
	}
}
