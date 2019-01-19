package com.brite.amazon.datastructures.stack;

public class Stack09 {
	int[] stack;
	int top =0;
	
	public Stack09(int size){
		this.stack = new int[size];
		this.top=-1;
	}
	
	public void push(int data){
		if (!isStackFull()){
			this.stack[++top]=data;
		}else{
			System.out.println("Stack Over Flow");
		}
		
	}
	public void pop(){
		if(!isStackEmpty()){
			int entry = this.stack[top--];
			System.out.println( "Removed entry "+entry);
		}else{
			System.out.println("Stack Under Flow");
		}
	}
	
	public int peek(){
		return this.stack[top];
	}
	
	private boolean isStackEmpty(){
		return this.top == -1;
	}
    private boolean isStackFull(){
    	return this.stack.length-1== this.top;
    }
   public static void main(String[] args) {
	   Stack09 stack = new Stack09(10);
	   for (int i = 0; i < 11; i++) {
			stack.push(i);
		}

		System.out.println("Peek " + stack.peek());

		for (int i = 0; i < 11; i++) {
			stack.pop();
		}
   }
}
