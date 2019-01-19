package com.brite.amazon.datastructures.stack;

public class Stack04 {
	int[] stack;
	int top=-1;
	
	public Stack04(int size){
		this.stack = new int[size];
	}

	public void push(int data){
		if(!isFull()){
			this.stack[++top]=data;
		}else{
			System.out.println("Stack is full");
		}
		
	}
	
	//LIFO
	public void pop(){
		if(!isEmpty()){
			int entry =stack[top--];
			System.out.println("Removed entry "+entry);
			
		}else{
			System.out.println("Stack UnderFlow");
		}
	}
	
	public int peek(){
		return stack[top];
	}
	
	private boolean isEmpty(){
		return this.top == -1;
	}
	
	private boolean isFull(){
		return stack.length-1 == top;
		
	}
	public static void main(String[] args) {
        Stack01 stack = new Stack01(10);
        for(int i=1;i<12;i++){
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
