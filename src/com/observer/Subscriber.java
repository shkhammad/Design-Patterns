package com.observer;

public class Subscriber implements Observer{
	
	private String name;
	private Subject subject;
	
	public Subscriber(String name, Subject subject) {
		this.name = name;
		this.subject = subject;
	}

	@Override
	public void update() {
		String message = subject.getMessage();
		System.out.println(message + " to " + this.name);
	}

}
