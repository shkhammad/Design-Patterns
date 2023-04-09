package com.state;

public class Device implements State{
	
	private State deviceState;
	
	public Device(State state) {
		this.deviceState = state;
	}
	
	@Override
	public void state() {
		deviceState.state();
	}
}
