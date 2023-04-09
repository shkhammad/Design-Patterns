package com.abstract_factory;

public class TeslaFactory extends Showroom{

	@Override
	public MotorVehicle getMotorVehicle() {
		return new TeslaMotorVehicle();
	}
	
	@Override
	public ElectricVehicle getElectricVehicle() {
		return new TeslaElectricVehicle();
	}
}
