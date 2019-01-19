package com.brite.amazon.datastructures.stack;

public class Stack07 {
	int[] stack;
	int top = 0;

	public Stack07(int size) {
		this.stack = new int[size];
		this.top = -1;
	}

	public void push(int data) {
		if (!isFull()) {
			stack[++top] = data;
		} else {
			System.out.println("Stack is Full");
		}
	}

	public void pop() {
		if (!isEmpty()) {
			int entry = stack[top--];
			System.out.println("Removed entry " + entry);
		} else {
			System.out.println("Stack Under Flow");
		}

	}

	public int peek() {
		return stack[top];
	}

	private boolean isEmpty() {
		return this.top == -1;
	}

	private boolean isFull() {
		return this.top == this.stack.length - 1;
	}
	public static void main(String[] args) {
		Stack07 stack = new Stack07(10);
		for (int i = 0; i < 11; i++) {
			stack.push(i);
		}

		stack.peek();

		for (int i = 0; i < 4; i++) {
			try {
				stack.pop();
			} catch (Exception e) {
				System.out.println("Stack under flow");
			}
		}
		
	}
}
