package com.brite.amazon.datastructures.queue;

public class Queue04 {
	int[] queue;
	int currentSize=0;
	int rear=0;
	int front=0;
	
	public Queue04(int size){
		this.queue = new int[size];
		this.rear=-1;
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
    	if(!isQueueEmpty()){
    		int entry = queue[front++];
    		System.out.println("Dequeue Element "+entry);
    		this.currentSize--;
    	}else{
    		System.out.println("Queue is UnderFlow");
    	}
    }
    
    private boolean isQueueFull(){
    	return this.currentSize==queue.length;
    }
    
    private boolean isQueueEmpty(){
    	return this.currentSize==0;
    }
    public int queueSize(){
    	return this.currentSize;
    }
    
public static void main(String[] args) {
	Queue04 queue = new Queue04(10);
	

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
