package com.abstract_factory;

public class HummerMotorVehicle implements MotorVehicle{
	
	@Override
	public void build() {
		System.out.println("Building Hummer-Motor-Vehicle... ");
	}
}
