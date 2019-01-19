package com.brite.amazon.datastructures.queue;

public class Queue05 {
	int[] queue;
	int front;
	int rear;
	int currentSize;

	public Queue05(int size) {
		this.currentSize = 0;
		this.rear = -1;
		this.queue = new int[size];
		this.front=0;
	}

	public void enqueue(int data) {
		if (!isQueueFull()) {
			this.rear++;
			queue[rear] = data;
			this.currentSize++;
		} else {
			System.out.println("Queue is Full");
		}
	}

	public void dequeue() {
		if (!isQueueEmpty()) {
			int entry = queue[front++];
			System.out.println("Removed entry " + entry);
			this.currentSize--;

		} else {
			System.out.println("Under Flow");
		}

	}
    private int queueSize(){
    	return this.currentSize;
    }
	private boolean isQueueEmpty() {
		return this.currentSize == 0;
	}

	private boolean isQueueFull() {
		return this.currentSize == queue.length;
	}
	
	public static void main(String[] args) {
		Queue05 queue = new Queue05(10);
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
