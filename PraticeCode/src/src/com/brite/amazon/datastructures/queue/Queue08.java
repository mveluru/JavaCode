package com.brite.amazon.datastructures.queue;

public class Queue08 {
	int[] queue;
	int front;
	int rear;
	int currentSize;
	
	public Queue08(int size){
		this.queue = new int[size];
		this.rear=-1;
		this.front =0;
		this.currentSize=0;
	}
	
	
	public void enqueue(int data){
		if (!isQueueFull()){
			queue[++rear]=data;
			this.currentSize++;
		}else{
			System.out.println("Queue is Full");
		}
	}
	
	public void dequeue(){
		if(!isQueueEmpty()){
			int entry = this.queue[front++];
			this.currentSize--;
			System.out.println("Removed Entry "+entry);
		}else{
			System.out.println("Queue is Empty");
		}
	}
	
	public boolean isQueueFull(){
		
		return this.currentSize== queue.length-1;
		
	}
	public boolean isQueueEmpty(){
		return this.currentSize==0;
	}
	
	public int queueSize(){
		return this.currentSize;
	}
	

	public static void main(String[] args) {
		Queue08 queue = new Queue08(10);
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
