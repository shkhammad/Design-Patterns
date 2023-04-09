package com.abstract_factory;

public class HummerElectricVehicle implements ElectricVehicle{
	
	@Override
	public void build() {
		System.out.println("Building Hummer-Electric-Vehicle...");
	}
}
