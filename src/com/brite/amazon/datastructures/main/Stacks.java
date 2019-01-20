package com.brite.amazon.datastructures.main;

public class Stacks {
 int[] stack;
 int size=0;
 int top =-1;
 int capacity=0;
  public Stacks(int size){
	  stack = new int[size];
	  //this.capacity = size;
  }
 public void push(int data){
	 if(!isStackFull()){
	 stack[++top]=data;
	 //this.capacity--;
	 }else{
		 System.out.println("Stack is full");
	 }
	 
 }
 public int pop(){
	 if (!isEmpty()){
		int data= this.stack[top] ;
		top--;
		return data;
	 }
	 return -1;
 }
 public int peek(){
	 return stack[top];
 }
 public boolean isEmpty(){
	return top == -1;
	 
 }
 
 public boolean isStackFull(){
	 return top == stack.length;
 }
 
 public static void main(String[] args) {
	Stacks stack = new Stacks(5);
	stack.push(5);
	stack.push(10);
	stack.push(15);
	stack.push(20);
	stack.push(25);
	System.out.println("peek");
	System.out.println(stack.peek());
	System.out.println("pop");
	System.out.println(stack.pop());
	System.out.println(stack.pop());
	System.out.println(stack.pop());
	System.out.println(stack.pop());
	System.out.println(stack.pop());
	System.out.println(stack.pop());
}
}
