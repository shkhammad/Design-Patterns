package com.strategy;

public class Test {

	public static void main(String[] args) {
		
		//strategy design-pattern
		//Strategy pattern is useful when we have multiple 
		//algorithms (strategies) for specific task and we want our 
		//application to be flexible to chose any of the 
		//algorithm at runtime for specific task.
		
		Cart cart = new Cart();
		
		cart.addItem(new Item("Mobile", 10000));
		cart.addItem(new Item("Laptop", 60000));
		cart.addItem(new Item("Headphones", 1000));
		
		cart.pay(new DebitCard(123456789,850,2025));
		cart.pay(new GPay("ABC987654321",2000));
		
	}

}
