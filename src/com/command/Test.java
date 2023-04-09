package com.command;

public class Test {
	
	public static void main(String[] args) {
		
		//command design-pattern
		//Command patterns decouple the objects of your software
		//program, as classes do not need to know about other objects in
		//the software system – the command object deals with the work
		//by invoking methods of receiver objects (Windows & Linux), and the original object does not
		//need to know what other objects are involved in the request
		
		Windows windows = new Windows();
	
		Invoker invocator1 = new Invoker(new OpenFileCommand(windows));
		invocator1.execute();
		
		invocator1 = new Invoker(new WriteFileCommand(windows));
		invocator1.execute();
		
		invocator1 = new Invoker(new CloseFileCommand(windows));
		invocator1.execute();
		
		Linux linux = new Linux();
		
		Invoker invocator2 = new Invoker(new OpenFileCommand(linux));
		invocator2.execute();
		
		invocator2 = new Invoker(new WriteFileCommand(linux));
		invocator2.execute();
		
		invocator2 = new Invoker(new CloseFileCommand(linux));
		invocator2.execute();
		
		
	}
}
