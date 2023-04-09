package com.facade;
import java.util.*;

public class Test {
	
	public static void main(String[] args) {
		
		//facade pattern
		//Hides the complexity of a subsystem by encapsulating it
		//behind a unifying wrapper called a facade class.
		//Provides client classes with a simplified interface for the
		//subsystem.
		// Acts simply as a point of entry to a subsystem and does
		//not add more functional subsystems.
		
		String savingsAccountNo = BankService.getAccountNumber("Savings", 10000);	
		String currentAccountNo = BankService.getAccountNumber("Current", 50000);
		
		System.out.println(savingsAccountNo);
		System.out.println(currentAccountNo);
		
		try {
			BankService.transferAmount(currentAccountNo,savingsAccountNo, 7000);
		} catch (Exception e) {
			System.out.println("Insufficient Balance !");
		}
		
		Map<String,BankAccount> mp = BankService.getBankAccounts();
			
		System.out.println(mp.get(savingsAccountNo).getAmount());
		System.out.println(mp.get(currentAccountNo).getAmount());
				
	}
}
