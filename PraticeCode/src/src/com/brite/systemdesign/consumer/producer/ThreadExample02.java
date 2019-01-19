package com.brite.systemdesign.consumer.producer;

public class ThreadExample02 {
	public static void main(String[] args) throws InterruptedException{
		PC02 pc = new PC02();
		
		Thread thread01 = new Thread(new Runnable(){

			@Override
			public void run() {
				try {
					pc.producer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		});
		
		Thread thread02 = new Thread (new Runnable(){

			@Override
			public void run() {
				try {
					pc.consumer();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		});
		
		thread01.start();
		thread02.start();
		thread01.join();
		thread02.join();
		
	}

}
