package com.observer;

public interface Subject {
	
	void addObserver(Observer observer);
	void removeObserver(Observer observer);
	String getMessage();
	void postMessage(String message);
}
