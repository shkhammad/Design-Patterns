package com.command;

//invoker class
public class Invoker implements Command{
	
	private Command command;
	
	public Invoker(Command command) {
		this.command = command;
	}
	
	@Override
	public void execute() {
		this.command.execute();
	}
	
}
