package com.brite.amazon.datastructures.stack;

public class StackImplementationUsingLList {
	Node head;
	Node tail;
	int top=-1;
	public StackImplementationUsingLList(int size){
		this.top = size;
	}
	
	// Always push on top
	public void push(int data){
		if(this.top != -1){
		Node newNode = new Node(data);
		if (head == null){
			head = newNode;
			tail = newNode;
			top--;
		}else{
			newNode.setNextRef(head);
			head = newNode;
			top--;
		}
		}else{
			System.out.println("Stack is full");
		}
		
	}
	
	public void pop(){
		if (head == null){
			System.out.println("Stack Empty ");
			return;
		}
		System.out.println(" Removed stack top element "+head.getData());
	    
		head = head.getNextRef();
	}
	public void peek(){
		System.out.println(" \n peek "+ head.getData());
	}

	public void travese(){
		if (head == null){
			System.out.println(" Stack is Empty");
			return;
		}
		Node tempNode = head;
		while (tempNode!=null){
			System.out.print(" "+tempNode.getData());
			tempNode = tempNode.getNextRef();
		}
	}
	
	public static void main(String[] args) {
		StackImplementationUsingLList stack  = new StackImplementationUsingLList(10);
		for (int i = 0; i < 11; i++) {
			stack.push(i);
		}
		stack.travese();
		stack.peek();
		System.out.println("\n P O P");
		for (int i = 0; i < 12; i++) {
			stack.pop();
		}
	}
}
