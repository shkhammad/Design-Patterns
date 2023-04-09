package com.factory_method;

public class Bike implements Vehicle{
	
	@Override
	public void build() {
		System.out.println("Building a bike...");
	}
}
