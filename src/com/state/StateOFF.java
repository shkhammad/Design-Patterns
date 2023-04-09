package com.state;

public class StateOFF implements State{
	
	@Override
	public void state() {
		System.out.println("Device is OFF");
	}
}
