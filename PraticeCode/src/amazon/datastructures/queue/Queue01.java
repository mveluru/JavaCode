package com.brite.amazon.datastructures.queue;

public class Queue01 {
	// FFIO

	int front = 0;
	int rear = -1;
	int[] queue;
	int currentSize;

	public Queue01(int size) {
		queue = new int[size];
		this.currentSize = 0;
	}

	public void enqueue(int data) {
		if (!isQueueFull()) {
			this.rear++;
			queue[this.rear] = data;
			this.currentSize++;
		} else {
			System.out.println("Queue is Full");
		}
	}

	// FFIO
	public void dequeue() {
		if (!isQueueEmpty()) {
			int entry = queue[this.front];
			this.front++;
			System.out.println("Dequeued Element " + entry);
			currentSize--;
		} else {
			System.out.println("Queue is Underflow");
		}

	}

	private int queueSize() {
		return this.currentSize;
	}

	private boolean isQueueEmpty() {
		return this.currentSize == 0;
	}

	private boolean isQueueFull() {
		return queue.length == this.currentSize;
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
		//queue.dequeue();
		System.out.println("Current queue size is .." + queue.queueSize());

	}
}
