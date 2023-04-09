package com.abstract_factory;

public class TeslaElectricVehicle implements ElectricVehicle{
	
	@Override
	public void build() {
		System.out.println("Building Tesla-Electric-Vehicle... ");
	}
}
