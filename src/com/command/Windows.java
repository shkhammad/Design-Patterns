package com.command;

//receiver class
public class Windows implements FileSystemReceiver{

	@Override
	public void openFile() {
		System.out.println("Opened a file in windows");
	}

	@Override
	public void writeFile() {
		System.out.println("Edited a file in windows");
	}

	@Override
	public void closeFile() {
		System.out.println("Closed a file in windows");
	}

}
