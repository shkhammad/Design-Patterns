package com.proxy;


//proxy class - internally calls ConsoleImpl class acts a wrapper
public class ProxyConsole implements Console{
	
	private boolean isAdmin;
	private Console console;
	
	public ProxyConsole(String user, String pwd) {
		if(user.equals("Hammad") && pwd.equals("august2000"))
			isAdmin = true;
		
		console = new ConsoleImpl();
	}
	
	@Override
	public void runCommand(String command) throws Exception{
		
		if(isAdmin)
			console.runCommand(command);
		
		else {
			
			if(command.startsWith("rm"))
				throw new Exception();
			else
				console.runCommand(command);
		}
		
	}

}
