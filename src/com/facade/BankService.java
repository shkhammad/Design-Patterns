package com.facade;
import java.util.*;

//facade class
public class BankService {
	
	private static String accountNumber;
	private static Map<String,BankAccount> bankAccounts = new HashMap<>();
	
	public static String getAccountNumber(String type, int amount) {
		
		BankAccount bankAccount;
		
		if(type.equals("Savings")) {
			bankAccount = new SavingsAccount(amount);
			accountNumber = "SA-6935";
		}
		
		else if(type.equals("Current")) {
			bankAccount = new CurrentAccount(amount);
			accountNumber = "CA-7000";
		}
		
		else 
			return "Invalid Account";
		
		
		bankAccounts.put(accountNumber, bankAccount);	
		return accountNumber;
	}
	
	public static void transferAmount(String from, String to, int amount) throws Exception{
		BankAccount fromAccount = bankAccounts.get(from);
		
		if(fromAccount.getAmount() > amount) {		
			bankAccounts.get(from).debit(amount);
			bankAccounts.get(to).credit(amount);
		}
		
		else throw new Exception();
	}
	
	public static Map<String,BankAccount> getBankAccounts(){
		return bankAccounts;
	}
}
