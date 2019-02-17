package com.brite.amazon.datastructures.linkedlist;

public class LinkedList15 {
	Node head;
	Node tail;
	
	public void inserAfter(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			tail = newNode;
		}else {
			tail.setNextRef(newNode);
			tail= newNode;
		}
	}
	
	public void insertBefore(int data) {
		Node newNode = new Node(data);
		if(head==null) {
			head = newNode;
			tail = newNode;
		}else {
			newNode.setNextRef(head);
			head = newNode;
		}
	}
    
	public void deleteFront() {
		if(head==null) {
			System.out.println("List Under flow");
		}else {
			System.out.println("Delete Data "+head.getData());
			head = head.getNextRef();
		}
	}
	
	public void deleteData(int data) {
		if(head == null) {
			System.out.println("List Under Flow");
		}else {
			
			if (head.getData()==data) {
				System.out.println("Delete Data"+head.getData());
				head = head.getNextRef();
			}else {
				Node tempNode = head.getNextRef();
				Node previousNode = head;
				Node nextNode = null;
				while(tempNode!=null) {
					if(tempNode.getData()==data) {
						nextNode = tempNode.getNextRef();
						
					}else {
						previousNode = tempNode;
						tempNode = tempNode.getNextRef();
					}
				}
				if(nextNode!=null) {
					previousNode.setNextRef(nextNode);
				}else {
					previousNode.setNextRef(null);
				}
			}
			
		}
	}
	
	public void traverse() {
		Node tempNode = head;
		while (tempNode !=null) {
			System.out.print(" "+tempNode.getData());
			tempNode = tempNode.getNextRef();
		}
	}
	
	public void reveseLinkList() {
		Node currentNode = head;
		Node previousNode = null;
		Node nextNode = null;
		while (currentNode !=null) {
			nextNode = currentNode.getNextRef();
			currentNode.setNextRef(previousNode);
			previousNode = currentNode;
			currentNode = nextNode;
		}
		head = previousNode;
	}
	
	public static void main(String[] args) {
		
		LinkedList14 ll = new LinkedList14();
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
		
		System.out.print(" \n Traversing \n");
		ll.traverse();
		
		
		System.out.println("\n Reversed Linked List ");
		ll.reversedLinkedList();
		
		ll.traverse();
		ll.deleteData(12);
		System.out.print(" \n Traversing \n");
		ll.traverse();
		
	}
}
