package com.brite.polymorphisms;

public class Greeter {

	public void greet(Greeting greeting) {
		greeting.perform();

	}

	public static void main(String[] args) {
		Greeter greeting = new Greeter();
		Greeting helloworldGreetig = new HelloWorldGreeting();
		
		greeting.greet(helloworldGreetig);
	}

}
