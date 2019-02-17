package com.brite.amazon.datastructures.queue;

public class Queue10 {

	int[] queue;
	int rear = -1;
	int front = 0;
	int currentSize = 0;

	public Queue10(int size) {
		queue = new int[size];

	}

	public void enqueue(int data) {
		if (!isQueueFull()) {
			this.rear++;
			queue[rear] = data;
			this.currentSize++;
		} else {
			System.out.println("Queue is FULL");
		}

	}

	// FIFO
	public void removeData() {

		if (!isQueueEmpty()) {
			int entry = queue[front++];
			this.currentSize--;
			System.out.println("Removed entry " + entry);
		} else {
			System.out.println(" Under Flow");
		}

	}

	public int queueSize() {
		return this.currentSize;
	}

	private boolean isQueueFull() {
		return this.queue.length - 1 == this.currentSize;
	}

	private boolean isQueueEmpty() {
		return this.currentSize == 0;
	}
	
	public static void main(String[] args) {
		Queue10 queue = new Queue10(10);
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
		
		queue.removeData();
		queue.removeData();
		queue.removeData();
		queue.removeData();
		queue.removeData();
		queue.removeData();
		queue.removeData();
		queue.removeData();
		queue.removeData();
		queue.removeData();
		queue.removeData();
		queue.removeData();
		//queue.dequeue();
		System.out.println("Current queue size is .." + queue.queueSize());
	}
}
