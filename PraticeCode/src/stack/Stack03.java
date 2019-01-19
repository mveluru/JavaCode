package com.brite.amazon.datastructures.stack;

public class Stack03 {
	int[] stack;
	int top = 0;
	

	Stack03(int size) {
		this.stack = new int[size];
		this.top = -1;
		
	}

	public void push(int data) {
		if (!isFull()) {
			this.stack[++top] = data;
		} else {
			System.out.println("Stack is full");
		}

	}

	public int pop() {
		int entry = 0;
		if (!isEmpty()) {
			entry = this.stack[top--];
			System.out.println("removed entry " + entry);
		} else {
			System.out.println("stack under flow");
		}
		return entry;
	}

	public int peek() {
		return stack[this.top];
	}

	private boolean isEmpty() {
		return (this.top == -1);
	}

	private boolean isFull() {
		return (stack.length-1 == this.top);
	}

	public static void main(String[] args) {
		Stack03 stack = new Stack03(10);
		for (int i = 0; i < 12; i++) {
			stack.push(i);
		}
		for (int i = 0; i < 4; i++) {
			stack.pop();
		}
	}

}
