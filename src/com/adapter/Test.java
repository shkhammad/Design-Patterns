package com.adapter;

public class Test {
	
	public static void main(String[] args) {
		
		//adapter pattern
		//Adapter design pattern is one of the structural design 
		//pattern and its used so that two unrelated interfaces 
		//(Socket & Client (Test)) can work together.  
		//The object (AdapterImpl) that joins these unrelated 
		//interface is called an Adapter.
		
		AdapterImpl mobileCharger = new AdapterImpl();
		System.out.println(mobileCharger.get3V().getVolts());
		
		AdapterImpl tabletCharger = new AdapterImpl();
		System.out.println(tabletCharger.get40V().getVolts());		
		
		AdapterImpl fridgeCharger = new AdapterImpl();
		System.out.println(fridgeCharger.get120V().getVolts());				
		
	}
}
