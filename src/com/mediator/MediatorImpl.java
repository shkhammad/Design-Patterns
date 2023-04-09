package com.mediator;
import java.util.*;

public class MediatorImpl implements Mediator{
	
	private List<User> users;
	
	public MediatorImpl() {
		users = new ArrayList<>();
	}
	
	@Override
	public void sendMessage(String message, User user) {
		for(User u: users) {
			if(u != user)
				u.receive(message, user);
		}
		
	}

	@Override
	public void addUser(User user) {
		this.users.add(user);
	}
	
	
}
