package com.facade;

public interface BankAccount {
	
	String type();
	int getAmount();
	void credit(int amount);
	void debit(int amount);
	
	
}
