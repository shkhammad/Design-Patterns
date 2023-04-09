package com.adapter;

//third-party class to be used
//gives out a default supply of 120V
public class Socket {
	
	private Volt volt;
	
	public Socket() {
		volt = new Volt(120);
	}
	
	public Volt get120V() {
		return this.volt;
	}
	
}
