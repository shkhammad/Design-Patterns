package com.singleton;

//similar to bill pugh's implementation but uses synchronization
//for thread-safety which has small performance overhead
//also employs double-locking, so that only one thread instantiates
//the instance and when instantiated doesn't re-instantiate it again
//inside the synchronized block
//also uses volatile keyword for avoiding memory inconsistency

public class SingletonLazyLock {
	
	private SingletonLazyLock() {}
	
	private static volatile SingletonLazyLock singletonLazyLock; 
	
	public static SingletonLazyLock getInstance() {
		
		//double-checked locking mechanism
		if(singletonLazyLock == null) {
			synchronized(SingletonLazyLock.class) {
				if(singletonLazyLock == null)
					singletonLazyLock = new SingletonLazyLock();
			}
		}
		return singletonLazyLock;
	}
	
		
}
