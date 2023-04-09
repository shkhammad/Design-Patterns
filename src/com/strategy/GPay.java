package com.strategy;

//second strategy
public class GPay implements PaymentStrategy{
	
	private String upiId;
	private int upiPin;
	
	public GPay(String upiId, int upiPin) {
		this.upiId = upiId;
		this.upiPin = upiPin;
	}

	@Override
	public void pay(double amount) {
		System.out.println("Rs " + amount + " paid using GPay");
	}

}
