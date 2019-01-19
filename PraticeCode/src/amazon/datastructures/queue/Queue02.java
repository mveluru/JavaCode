package com.brite.amazon.datastructures.queue;

public class Queue02 {
	int[] queue;
	int currentSize = 0;
	int front = 0;
	int rear = 0;

	public Queue02(int size) {
		this.queue = new int[size];
		this.rear = -1;
		this.currentSize = 0;
	}

	public void enqueue(int data) {
		if (!isFull()) {
			this.rear++;
			this.queue[rear] = data;
			this.currentSize++;
		} else {
			System.out.println("Queue is Full");
		}
	}

	public void dequeue() {
		if (!isEmpty()) {
			this.front++;
			int entry = queue[front];
			this.currentSize--;
			System.out.println("Removed entry " + entry);
		} else {
			System.out.println("Queue under flow");
		}
	}

	private int queueSize() {

		return this.currentSize;
	}

	private boolean isFull() {
		return this.currentSize == queue.length;
	}

	private boolean isEmpty() {
		return this.currentSize == 0;
	}
	
	public static void main(String[] args) {
		Queue02 queue = new Queue02(20);

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
