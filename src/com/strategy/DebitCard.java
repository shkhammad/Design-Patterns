package com.strategy;

//first strategy
public class DebitCard implements PaymentStrategy{
	
	private int cardNumber;
	private int cvv;
	private int yearOfExpiry;
	
	public DebitCard(int cardNumber, int cvv, int yearOfExpiry) {
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.yearOfExpiry = yearOfExpiry;
	}
	
	@Override
	public void pay(double amount) {
		System.out.println("Rs " + amount + " paid using Debit Card");
	}

}
