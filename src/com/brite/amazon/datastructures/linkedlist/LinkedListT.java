package com.brite.amazon.datastructures.linkedlist;

public class LinkedListT {
	Node head;
	Node tail;
	
	public void insertAfter(int data) {
		Node newNode = new Node(data);
		if (head==null) {
			head = newNode;
			tail = newNode;
		}else {
			tail.setNextRef(newNode);
			tail=newNode;
		}
		
	}
	
	public void insertBefore(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		}else {
			newNode.setNextRef(head);
			head = newNode;
		}
		
	}
	
	public void deleteFront() {
		if (head == null) {
			System.out.println("List is empty");
		}else {
			System.out.println(" Deleted Head Node "+head.getData());
			head = head.getNextRef();
		}
	}
	
	public void deleteData(int data){
	   if (head == null) {
		   System.out.println("List is empty");
	   }else {
		   if (head.getData()== data) {
			   System.out.println("Deleted Head Node "+head.getData());
			   head = head.getNextRef();
		   }else {
			   Node tempNode = head.getNextRef();
			   Node  previousNode = head;
			   Node nextNode = null;
			   while (tempNode !=null) {
				   if (tempNode.getData()==data) {
					   nextNode = tempNode.getNextRef();
					   
				   }else {
					   previousNode = tempNode;
					   tempNode = tempNode.getNextRef();
				   }
			   }
			   if (nextNode !=null) {
				   previousNode.setNextRef(nextNode);
				   
			   }else {
				  previousNode.setNextRef(tail);
				  tail = previousNode;
			   }
			   
			   
		   }
	   }
		
		
	}
	public void reverseLinkedList() {
		System.out.println("\n Reversed Linked List ");
		Node currentNode = head;
		Node prerviousNode = null;
		Node nextNode = null;
		while (currentNode !=null) {
			nextNode = currentNode.getNextRef();
			currentNode.setNextRef(prerviousNode);
			prerviousNode = currentNode;
			currentNode=nextNode;
		}
		 head=prerviousNode;
				
	}
	public void traverse() {
		Node tempNode = head;
		while (tempNode!=null) {
			System.out.print(" "+tempNode.getData());
			tempNode = tempNode.getNextRef();
		}
	}
public static void main(String[] args) {
	LinkedListT ll = new LinkedListT();
	ll.insertAfter(100);
	ll.insertAfter(22);
	ll.insertAfter(22);
	ll.insertAfter(53);
	ll.insertAfter(40);
	ll.insertAfter(41);
	ll.insertAfter(38);
	ll.insertBefore(26);
	ll.insertBefore(34);
	ll.insertBefore(30);
	ll.insertBefore(18);
	ll.insertBefore(15);
	ll.insertBefore(12);
	ll.insertBefore(19);
	/*System.out.print(" \n Bubble Sort \n");
	ll.bubbleSort();*/
	System.out.print(" \n Traversing \n");
	ll.traverse();
	ll.reverseLinkedList();
	ll.traverse();
}
}
