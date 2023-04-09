package com.singleton;

//uses eager-loading of the object
//it is the slowest among the three implementations but is thread-safe
public class SingletonEager {
	
	private SingletonEager(){}
	
	private static final SingletonEager singleton = new SingletonEager();		
	
	public static SingletonEager getInstance() {
		
		synchronized(SingletonEager.class) {
			return singleton;	
		}
	}

}
