package com.brite.amazon.datastructures.stack;

public class Stack01 {
	int[] stack;
	int top = -1;

	public Stack01(int size) {
		this.stack = new int[size];
	}

	public void push(int data) {
		if (!isStackFull()) {
			stack[++top] = data;
		} else {
			System.out.println("Over Flow");
		}

	}

	public void pop() {
		if (!isStackEmpty()) {
			int entry = stack[top--];
			System.out.println("Removed stack Element " + entry);
		} else {
			System.out.println("Under Flow");
		}

	}

	public int peek() {
		return this.stack[top];
	}

	private boolean isStackEmpty() {
		return this.top == -1;
	}

	private boolean isStackFull() {
		return this.stack.length - 1 == this.top;
	}

	public static void main(String[] args) {
		Stack01 stack = new Stack01(10);
		for (int i = 0; i < 11; i++) {
			stack.push(i);
		}
		for (int i = 1; i < 4; i++) {
			try {
				stack.pop();
			} catch (Exception e) {

				e.printStackTrace();
			}
		}

	}
}
