package com.brite.pattern.observer;

public class Internet implements IObserver {

	@Override
	public void update(float interest) {
		System.out.println("Internet: Interest Rate updated, new Rate is: "
                + interest);
		
	}

}
