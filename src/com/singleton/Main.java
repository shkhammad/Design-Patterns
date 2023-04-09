package com.singleton;

public class Main {	
	public static void main(String[] args) {
		
		
		//Singleton Design Pattern - 3 implementations
		//only one instance of the Singleton class exists in the JVM at a time
		SingletonLazy singleton1 = SingletonLazy.getInstance();
		SingletonLazy singleton2 = SingletonLazy.getInstance();
		
		if(singleton1 == singleton2)
			System.out.println("YES");
		
		else
			System.out.println("NO");
		
		SingletonLazyLock singleton3 = SingletonLazyLock.getInstance();
		SingletonLazyLock singleton4 = SingletonLazyLock.getInstance();
		
		if(singleton3 == singleton4)
			System.out.println("YES");
		
		else
			System.out.println("NO");
		
		SingletonEager singleton5 = SingletonEager.getInstance();
		SingletonEager singleton6 = SingletonEager.getInstance();
		
		if(singleton5 == singleton6)
			System.out.println("YES");
		
		else
			System.out.println("NO");
		
	}
}
