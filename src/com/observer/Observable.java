package com.observer;
import java.util.*;

public class Observable implements Subject{
	
	private List<Observer> observers;
	private String message;
	
	public Observable() {
		observers = new ArrayList<>();
		message = null;
	}
	
	@Override
	public void addObserver(Observer observer) {
		this.observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		this.observers.remove(observer);
	}

	private void notifyObservers() {
		List<Observer> tempObservers = new ArrayList<>(observers);
		
		for(Observer o: tempObservers)
			o.update();
		
		this.message = null;
	}

	@Override
	public String getMessage() {
		if(this.message == null)
			return "No new message!";
		
		return this.message;
	}
	
	@Override
	public void postMessage(String message) {
		this.message = message;
		notifyObservers();
	}
}
