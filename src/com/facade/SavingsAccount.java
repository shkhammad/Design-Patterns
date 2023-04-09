package com.facade;

public class SavingsAccount implements BankAccount{
	
	private int amount;
	
	public SavingsAccount() {}
	
	public SavingsAccount(int amount) {
		this.amount = amount;
	}
	
	@Override
	public int getAmount() {
		return this.amount;
	}
		
	@Override
	public String type() {
		return "Savings";
	}
	
	@Override
	public void credit(int amount) {
		this.amount += amount;
	}
	
	@Override
	public void debit(int amount) {
		this.amount -= amount;
	}
	
}
