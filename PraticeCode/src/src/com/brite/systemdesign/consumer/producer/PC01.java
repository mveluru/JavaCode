package com.brite.systemdesign.consumer.producer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PC01 {
	LinkedList<Integer> list = new LinkedList<>();
	int capacity=2;
	
	public void produce () throws InterruptedException{
		int value =0;
		while (true){
			synchronized(this){
				while (list.size()==2){
					wait();
				}
				System.out.println( "Producer  Produced "+value);
				list.add(value++);
				
				notify();
				Thread.sleep(1000);
			}
			
		}
	}
   
	public void consume() throws InterruptedException{
		
		while (true){
			synchronized(this){
				while(list.size()==0){
					wait();
				}
				int value = list.removeFirst(); 
				System.out.println( "consumer consumed "+value);
				notify();
				Thread.sleep(1000);
			}
			
		}
	}
}
