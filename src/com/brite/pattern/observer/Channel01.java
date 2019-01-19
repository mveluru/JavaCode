package com.brite.pattern.observer;

public class Channel01 implements IObserver{

	@Override
	public void update(float interest) {
	    System.out.println("Newspaper: Interest Rate updated, new Rate is: "
                + interest);		
	}
	

}
