package com.brite.amazon.datastructures.stack;

public class Stack02 {

	int[] stack;
	int top;
	
	
	public Stack02(int size){
		stack = new int[size];
		top =-1;
		
	}
	
	public void push(int i){
		if(!isFull()){
			stack[++top]=i;
		}else{
			System.out.println("Warning:: stack is full ");
		}
	}
	
	public int peek(int i){
		return stack[top];
	}
	
	public boolean isEmpty(){
		return (top == -1);
	}
	
	public boolean isFull(){
		return (this.top == stack.length-1);
	}
	
	
	
	public int pop(){
		int entry = stack[top--];
		System.out.println("Removed Entry ::"+entry);
		return entry;
	}
	
	public static void main(String[] args) {
		Stack02 stack = new Stack02(12);
		for (int i=0;i<11;i++){
			stack.push(i);
		}
		for(int i=1;i<4;i++){
            try {
                stack.pop();
            } catch (Exception e) {
                
                e.printStackTrace();
            }
        }
	}
}
