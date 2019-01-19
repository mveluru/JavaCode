package com.brite.amazon.datastructures.queue;

public class Queue09 {

	int[] queue;
	int rear = -1;
	int front = 0;
	int currentSize = 0;

	public Queue09(int size) {
		this.queue = new int[size];
	}

	public void enqueue(int data) {
		if (!(isQueueFull())) {
			queue[++rear] = data;
			this.currentSize++;
		} else {
			System.out.println("Over Flow");
		}
	}

	public void dequeue() {
		if (!(isQueueEmpty())) {
			int entry = queue[front++];
			this.currentSize--;
			System.out.println("removed entry" + entry);
		} else {
			System.out.println("Under Flow");
		}
	}

	public boolean isQueueEmpty() {
		return this.currentSize == 0;
	}

	public boolean isQueueFull() {
		return this.currentSize == this.queue.length - 1;
	}

	public int queueSize() {
		return this.currentSize;
	}

	public static void main(String[] args) {
		Queue09 queue = new Queue09(10);
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
