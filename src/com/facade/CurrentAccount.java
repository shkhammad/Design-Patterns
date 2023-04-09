package com.facade;

public class CurrentAccount implements BankAccount{
	
	private int amount;
	
	public CurrentAccount() {}
	
	public CurrentAccount(int amount) {
		this.amount = amount;
	}
	
	@Override
	public int getAmount() {
		return this.amount;
	}
	
	@Override
	public String type() {
		return "Current";
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
