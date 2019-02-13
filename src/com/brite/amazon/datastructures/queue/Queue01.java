package com.brite.amazon.datastructures.queue;

public class Queue01 {
	int[] queue;
	int front=0;
	int rear=-1;
	int currentSize=0;
	public Queue01(int size){
		this.queue = new int[size];
	}
	
	public void enqueue(int data){
		if(!isQueueFull()){
			queue[++rear]=data;
			this.currentSize++;
		}else{
			System.out.println("Queue over flow");
		}
	}
	// FFIO
	public void dequeue(){
		if(!isQueueEmpty()){
			int entry = queue[front++];		
			this.currentSize--;
			System.out.println("Removed Entry "+entry);
		}else{
			System.out.println("Queue Under flow");
		}
		
	}
	
	private boolean isQueueEmpty(){
		return this.currentSize==0;
	}
	
	private boolean isQueueFull(){
		return this.currentSize == this.queue.length-1;
	}

	
	public int queueSize(){
		return this.currentSize;
	}
	

	public static void main(String[] args) {
		Queue01 queue = new Queue01(20);

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
		queue.dequeue();
		System.out.println("Current queue size is .." + queue.queueSize());

	}
}
