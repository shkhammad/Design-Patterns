package com.proxy;

//subject class
public class ConsoleImpl implements Console{

	@Override
	public void runCommand(String command) {
		System.out.println(command + " executed");
	}

}
