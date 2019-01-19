package com.brite.amazon.datastructures.stack;

public class Stack08 {
	int[] stack;
	int top = 0;

	public Stack08(int size) {
		this.stack = new int[size];
		this.top = -1;
	}

	public void push(int data) {
		if (!isStackFull()) {
			stack[++top] = data;
		} else {
			System.out.println("Stack is full");
		}

	}

	public void pop() {
		if (!isStackEmpty()) {
			int entry = stack[top--];
			System.out.println("Removed entry " + entry);
		} else {
			System.out.println("Under Flow");
		}

	}

	public int peek() {
		return this.stack[top];
	}

	public boolean isStackEmpty() {
		return this.top == -1;
	}

	public boolean isStackFull() {

		return this.top == this.stack.length-1;
	}

	public static void main(String[] args) {
		Stack08 stack = new Stack08(10);
		for (int i = 0; i < 11; i++) {
			stack.push(i);
		}

		System.out.println("Peek " + stack.peek());

		for (int i = 0; i < 11; i++) {
			stack.pop();
		}
	}
}
