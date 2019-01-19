package com.brite.amazon.datastructures.queue;

public class Queue {

int[] queue;
int front=0;
int rear =0;
int currentSize=0;


public Queue(int size){
	this.queue = new int[size];
	this.rear=-1;
	
}

public void enqueue(int data){
	if (!isFull()){
		rear++;
		queue[rear]=data;
		this.currentSize++;
		
	}else{
		System.out.println("Queue is Full");
	}
	
}

/*
 * First in First Out
 */
public void dequeue(){
	if (!isEmpty()){
		
		int entry = queue[front++];
		
		this.currentSize--;
		System.out.println("Dequeued Element "+ entry);
	}else{
	   System.out.println("Queue is Under Flow");
	}
	
}

public int queueSize(){
	if (!isEmpty()){
		return this.currentSize;
	}
	return 0;
}

	private boolean isFull() {
		return this.queue.length == currentSize;

	}

	private boolean isEmpty(){
		return this.currentSize==0;
	}

	public static void main(String[] args) {
		Queue queue = new Queue(10);
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
		   
		  System.out.println("Current queue size is .."+queue.queueSize());  ;
	       queue.dequeue();
	       System.out.println("Current queue size is .."+queue.queueSize());  ;
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
	      
	        
	}
}
