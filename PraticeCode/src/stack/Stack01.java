package com.brite.amazon.datastructures.stack;

public class Stack01 {
	int [] stack;
	int top=0;
	
	
	
	Stack01(int capacity){
		stack = new int[capacity];
		this.top=-1;
		
	}
	
	public void push(int element){
		try{
		if(isStackFull()){
			
			throw new Exception("stack is full");
		}else{
		stack[++top]=element;
		}
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
		
	}
	
	public int  pop(){
		int entry = stack[top--];
		System.out.println("Removed entry "+entry);
		return entry;
	}
	
	public int peek(){
		System.out.println("pop entry "+stack[top]);
		return stack[top];
	}
	
	public boolean isEmpty(){
	  return (top == -1);
	}
	
	public boolean isStackFull(){
		return top == stack.length-1;
	}
	
	 public static void main(String[] args) {
            Stack01 stack = new Stack01(30);
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
