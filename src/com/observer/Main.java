package com.observer;

public class Main {

	public static void main(String[] args) {
		
		//observer design-pattern
		//The observer design pattern is a pattern where a subject
		//keeps a list of observers. Observers rely on the subject to
		//inform them of changes to the state of the subject.
		
		Subject subject = new Observable();
		
		Observer observer1 = new Subscriber("Hammad", subject);
		Observer observer2 = new Subscriber("Sikandar", subject);
		Observer observer3 = new Subscriber("Samina", subject);
		
		subject.addObserver(observer1);
		subject.addObserver(observer2);
		subject.addObserver(observer3);
		
		subject.postMessage("New video uploaded: How to install VS-Code");
		subject.addObserver(new Subscriber("Lex", subject));
		
		observer1.update();
		observer3.update();
		
		subject.postMessage("New video uploaded: How to install IntelliJ-IDEA");
		
		System.out.println(subject.getMessage());
	}

}
