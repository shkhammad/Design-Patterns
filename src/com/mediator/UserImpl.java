package com.mediator;

public class UserImpl implements User{

	private Mediator mediator;
	private String name;
	
	public UserImpl(Mediator mediator, String name) {
		this.mediator = mediator;
		this.name = name;
	}
	
	@Override
	public void send(String message) {
		mediator.sendMessage(message, this);
	}
	
	@Override
	public void receive(String message, User user) {
		System.out.println(user.name());
		System.out.println(message + " to " + this.name);
	}
	
	@Override
	public String name() {
		return this.name;
	}
}
