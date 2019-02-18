package com.brite.datastructures.thread;

public class TestThread implements Runnable{

	@Override
	public void run() {
		System.out.printf("%d",3);
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		Thread thread = new Thread(new TestThread());
		thread.start();
		System.out.printf("%d", 1);
		thread.join();
		System.out.printf("%d", 2);
	}

}
