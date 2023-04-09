package com.abstract_factory;

public class HummerFactory extends Showroom{
	
	@Override
	public MotorVehicle getMotorVehicle() {
		return new HummerMotorVehicle();
	}
	
	@Override
	public ElectricVehicle getElectricVehicle() {
		return new HummerElectricVehicle();
	}
}
