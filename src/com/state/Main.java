package com.state;

public class Main {
	
	public static void main(String[] args) {
		
		//state design-pattern
		//State design pattern is used when an object change 
		//its behavior based on its internal state.
		//it is easy to add more states for additional behavior
		
		Device device = new Device(new StateON());
		device.state();
		
		device = new Device(new StateOFF());
		device.state();
	}
}
