package com.proxy;

public class Test {
	
	public static void main(String[] args) {
		
		//proxy design pattern
		//Proxy design pattern common uses are to control access or to 
		//provide a wrapper implementation for better performance.
		
		Console console1 = new ProxyConsole("hammad", "august2000");
		
		try {
			console1.runCommand("pwd");
			console1.runCommand("dir");
			console1.runCommand("ls");
			console1.runCommand("rm file.txt");
		}
		
		catch(Exception e) {
			System.out.println("Cannot execute rm command for a non-admin user");
		}
			
	}
}
