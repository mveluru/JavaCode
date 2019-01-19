package com.brite.amazon.datastructures.queue;

public class Queue03 {
	int[] queue;
	int currentSize;
	int front=0;
	int rear =0;;
	
	public Queue03(int size){
		this.rear =-1;
		this.queue= new int[size];
		this.currentSize=0;
	}

	
	public void enqueue(int data){
		if(!isQueueFull()){
			queue[++rear]=data;
			currentSize++;
		}else{
			System.out.println("Queue is full");
		}
	}
	
		
	public void dequeue(){
		if(!isQueueEmpty()){
			int entry =queue[front++];
			this.currentSize--;
			System.out.println("Removed Entry "+entry);
		}else{
			System.out.println("Queue underflow");
		}
		
	}
	
	public int queueSize(){
		return this.currentSize;
	}
	private boolean isQueueFull(){
		return this.currentSize== queue.length;
	}
	
	private boolean isQueueEmpty(){
		return this.currentSize==0;
	}
	
	public static void main(String[] args) {
		Queue03 queue = new Queue03(20);

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
		//queue.dequeue();
		System.out.println("Current queue size is .." + queue.queueSize());
	}
}
