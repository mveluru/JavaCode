package com.brite.amazon.datastructures.stack;

public class Stack12 {
	int[] stack;
	int top = -1;

	public Stack12(int size) {
		this.stack = new int[size];

	}

	// push from top
	public void push(int data) {
		if (!isStackFull()) {
			this.stack[++top] = data;
		} else {
			System.out.println("Stack is full");
		}
	}

	public void pop() {

		if (!isStackEmpty()) {
			int entry = this.stack[top--];
			System.out.println("removed Entry " + entry);
		} else {
			System.out.println("under flow");
		}

	}

	public int peek() {

		return this.stack[top];

	}

	private boolean isStackEmpty() {
		return top == -1;
	}

	private boolean isStackFull() {

		return this.stack.length - 1 == this.top;
	}

	public static void main(String[] args) {
		Stack11 stack = new Stack11(10);
		for (int i = 0; i < 11; i++) {
			stack.push(i);
		}

		System.out.println("Peek " + stack.peek());

		for (int i = 0; i < 11; i++) {
			stack.pop();
		}

	}
}
