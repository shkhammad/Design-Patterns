package com.command;

//receiver class
public class Linux implements FileSystemReceiver{

	@Override
	public void openFile() {
		System.out.println("Opened a file in linux");
	}

	@Override
	public void writeFile() {
		System.out.println("Edited a file in linux");
	}

	@Override
	public void closeFile() {
		System.out.println("Closed a file in linux");
	}

}
