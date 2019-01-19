package com.brite.amazon.datastructures.stack;

public class Stack06 {
	int[] stack;
	int top = 0;

	public Stack06(int size) {
		stack = new int[size];
		this.top = -1;

	}

	public void push(int data) {
		if (!isFull()) {
			stack[++top] = data;
		} else {
			System.out.println("Stack is full");
		}
	}

	public void pop() {
		if (!isEmpty()) {
			int entry = stack[top--];
			System.out.println("removed entry " + entry);
		}
	}

	public int peek() {
		System.out.println(stack[top]);
		return stack[top];
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {

		return top == stack.length - 1;
	}

	public static void main(String[] args) {
		Stack06 stack = new Stack06(10);
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
