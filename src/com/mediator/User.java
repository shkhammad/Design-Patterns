package com.mediator;

public interface User {
	
	String name();
	void send(String message);
	void receive(String message, User user);
}
