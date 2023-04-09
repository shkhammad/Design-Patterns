package com.strategy;
import java.util.*;

public class Cart {
	
	private List<Item> items;
	
	public Cart() {
		items = new ArrayList<>();
	}
	
	public void addItem(Item item) {
		items.add(item);
	}
	
	public void removeItem(Item item) {
		items.remove(item);
	}
	
	private double getTotal() {
		double total = 0;
		
		for(Item item: items)
			total += item.getPrice();
		
		return total;
	}
	
	public void pay(PaymentStrategy paymentStrategy) {
		paymentStrategy.pay(getTotal());
	}
}


