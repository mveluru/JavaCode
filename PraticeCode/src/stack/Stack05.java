package com.brite.amazon.datastructures.stack;

public class Stack05 {
	int[] stack;
	int top = 0;

	public Stack05(int size) {
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

	public int peek() {
		System.out.println("peek entry "+stack[top]);
		return stack[top];
	}


	
	//LIFO
		public void pop(){
			if(!isEmpty()){
				int entry =stack[this.top--];
				System.out.println("Removed entry "+entry);
				
			}else{
				System.out.println("Stack UnderFlow");
			}
		}

	private boolean isEmpty() {
		return this.top == -1;
	}

	private boolean isFull() {
		return this.stack.length - 1 == top;
	}

	public static void main(String[] args) {
		 Stack01 stack = new Stack01(10);
	        for(int i=1;i<10;i++){
	            stack.push(i);
	        }
	        stack.peek();
	        for(int i=1;i<11;i++){
	            try {
	                stack.pop();
	            } catch (Exception e) {
	                
	                e.printStackTrace();
	            }
	        }
		
	}
}
