package com.brite.amazon.datastructures.linkedlist;

import com.brite.amazon.datastructures.linkedlist.Node;

public class LinkedList04 {
	Node head;
	Node tail;

	/*
	 * Insert Node at the end;
	 */
	public void insertData(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.setNextRef(newNode);
			tail = newNode;
		}

	}

	public void deleteFront() {
		if (head == null){
			System.out.println("Under Flow");
			return;
			
		}else{
			System.out.println("Delete Front data " + head.getData());
			head = head.getNextRef();
		  
		}

	}

	public void deleteData(int data) {
		if (head ==null){
			System.out.println("Under Flow");
			return;
		}else{
			if (head.getData()== data){
				System.out.println(" Deleted data "+head.getData());
				head = head.getNextRef();
			}else{
				Node tempNode = head.getNextRef();
				Node previousNode = head;
				Node datafoundNode =null;
				while (tempNode!=null){
					if (tempNode.getData()==data){
						datafoundNode = tempNode;
					}else{
						previousNode = tempNode;
						tempNode = tempNode.getNextRef();
					}
				}
				if (datafoundNode !=null){
					System.out.println("Deleted data "+datafoundNode.getData());
					Node tmpNode = datafoundNode.getNextRef();
					previousNode.setNextRef(tmpNode);
					datafoundNode.setNextRef(null);
				}else{
					
					previousNode.setNextRef(tail);
					tail = previousNode.getNextRef();
				}
			}
		}

	}

	public void traverse() {
		if (head ==null){
			System.out.println("Linked List under flow");
			return;
		}
		Node tempNode = head;
		while (tempNode != null) {
			System.out.print(" " + tempNode.getData());
			tempNode = tempNode.getNextRef();
		}

	}

	public void reverseLinkedList() {
		Node currentNode = head;
		Node nextNode = null;
		Node previousNode =null;
		while (currentNode !=null){
			nextNode = currentNode.getNextRef();
			currentNode.setNextRef(previousNode);
			previousNode =currentNode;
			currentNode = nextNode;
			
		}
		head = previousNode;
	}

	public static void main(String[] args) {
		LinkedList04 ll = new LinkedList04();
		ll.insertData(200);
		ll.insertData(11);
		ll.insertData(12);
		ll.insertData(13);
		ll.insertData(14);
		ll.insertData(15);
		ll.insertData(16);
		ll.traverse();
		System.out.println();
		ll.deleteFront();
		System.out.println();
		ll.traverse();
		System.out.println();
		
		ll.deleteData(11);
		ll.traverse();
		System.out.println("\nReverse Linked List");
		ll.reverseLinkedList();
		ll.traverse();

	}
}
