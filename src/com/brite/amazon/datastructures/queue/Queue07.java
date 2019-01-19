package com.brite.amazon.datastructures.queue;

public class Queue07 {
	int[] queue;
	int front;
	int rear;
	int currentSize;
	
	public Queue07(int size){
		queue = new int[size];
		this.front=0;
		this.rear=-1;
		this.currentSize=0;
	}

	public void enqueue(int data) {
		if (!isQueueFull()) {
			queue[++rear] = data;
			this.currentSize++;
		} else {
			System.out.println(" Over Flow");
		}
	}

	public void dequeue() {
		if (!isQueueEmpty()) {
			int entry = queue[front++];
			this.currentSize--;
			System.out.println("Dequeued Entry "+entry);

		} else {
			System.out.println(" Under Flow");
		}
	}

	public int queueSize() {
		return currentSize;
	}

	private boolean isQueueFull() {
		return this.currentSize == this.queue.length;
	}

	private boolean isQueueEmpty() {
		return this.currentSize == 0;
	}
	
	public static void main(String[] args){
		Queue07 queue = new Queue07(10);
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
