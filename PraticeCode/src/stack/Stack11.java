package com.brite.amazon.datastructures.stack;

public class Stack11 {
int[] stack;
int top =0;

public Stack11(int size){
	this.stack = new int[size];
	this.top =-1;
}

public void push (int data){
	if(!isStackFull()){
		stack[++top]=data;
	}else{
		System.out.println("Over Flow");
	}
	
}
public void pop (){
	if(!isStackEmpty()){
		int entry =this.stack[top--];
		System.out.println("Removed Entry "+entry);
	}else{
		System.out.println("Stack under flow");
	}
	
}

public int peek(){
	return stack[top];
	
}
private boolean isStackEmpty(){
	return this.top==-1;
}
public boolean isStackFull(){
return this.stack.length-1 == this.top;
}
public static void main(String[] args){
	Stack11 stack = new Stack11(10);
	 for (int i = 0; i < 11; i++) {
			stack.push(i);
		}

		System.out.println("Peek " + stack.peek());

		for (int i = 0; i < 11; i++) {
			stack.pop();
		}
}
}
