package com.singleton;

//Bill Pugh Singleton Lazy Implementation
//best implementation of the singleton pattern
//uses lazy initialization and instantiates the object only when
//needed through the getInstance method
//the inner class gets loaded in the memory only when the getInstance
//method is invoked
//the performance is best since there is no synchronization overhead
public class SingletonLazy {
		
	private SingletonLazy(){}
		
	private static class Helper {
		static final SingletonLazy singleton = new SingletonLazy();			
	}

	public static SingletonLazy getInstance() {
		return Helper.singleton;	
	}
}
