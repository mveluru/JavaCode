package com.brite.amazon.datastructures.queue;

public class Queue06 {
	int[] queue;
	int currentSize;
	int front;
	int rear=0;
	
	public Queue06(int size){
		this.queue = new int[size];
		this.currentSize=0;
		this.rear =-1;
		this.front =0;
	}
	
	public void enqueue(int data){
		if(!isQueueFull()){		
			queue[++rear]=data;
			this.currentSize++;
		}else{
			System.out.println("Queue is FULL");
		}
		
	}
	
   public void dequeue(){
	   if (!isQueueEmpty()){	   
		   int entry = queue[front++];
		   System.out.println(" Removed Element "+entry);
		   this.currentSize--;
		   
	   }else{
		   System.out.println("Queue is Under Flow");
	   }
	   
   }
   
   public int queueSize(){
	   return this.currentSize;
   }
   
   public boolean isQueueEmpty(){
	   
	   return this.currentSize == 0;
   }
   
   public boolean isQueueFull(){
	   return this.currentSize == this.queue.length;
   }
   
   public static void main(String[] args) {
	   Queue06 queue = new Queue06(10);
	   	queue.enqueue(50);
		queue.enqueue(51);
		queue.enqueue(52);
		queue.enqueue(53);
		queue.enqueue(54);
		queue.enqueue(55);
		queue.enqueue(56);
		queue.enqueue(57);
		queue.enqueue(58);
		queue.enqueue(59);
		queue.enqueue(60);
		//queue.enqueue(61);

		System.out.println("Current queue size is .." + queue.queueSize());
		
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		queue.dequeue();
		//queue.dequeue();
		System.out.println("Current queue size is .." + queue.queueSize());
}
}
