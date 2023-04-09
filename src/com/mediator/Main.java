package com.mediator;

public class Main {

	public static void main(String[] args) {
		
		//mediator design-pattern	
		//Mediator pattern is useful when the communication logic 
		//between objects is complex, we can have a central point of 
		//communication (mediator) that takes care of communication logic.
		
		Mediator mediator = new MediatorImpl();
		
		User u1 = new UserImpl(mediator,"Hammad");
		User u2 = new UserImpl(mediator,"Sikandar");
		User u3 = new UserImpl(mediator,"Samina");
		
		mediator.addUser(u1);
		mediator.addUser(u2);
		mediator.addUser(u3);
		
		u2.send("Hi, What's up?");
		
		
	}

}
