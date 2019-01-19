package com.brite.systemdesign.consumer.producer;

public class ThreadExample01 {
	public static void main(String[]args) throws InterruptedException{
		final PC01 pc = new PC01();
		Thread thread01 = new Thread(new Runnable(){

			@Override
			public void run() {
				try{
					pc.produce(); 
				}catch (InterruptedException e){
					e.printStackTrace();
				}
				
			}
			
		});
		
		Thread thread02 = new Thread(new Runnable(){

			@Override
			public void run() {
				try{
					pc.consume(); 
				}catch (InterruptedException e){
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
