package com.factory_method;

public class Car implements Vehicle{
	
	@Override
	public void build() {
		System.out.println("Building a car...");
	}
}
