package com.brite.amazon.datastructures.linkedlist;

import com.brite.amazon.datastructures.linkedlist.Node;

public class LinkedList06 {
	Node head;
	Node tail;

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
		if (head == null) {
			System.out.println("\n Linked List is underflow");
			return;
		} else {
			System.out.println("\n Delete Front Data " + head.getData());
			head = head.getNextRef();
		}

	}

	public void deleteData(int data) {
		if (head == null) {
			System.out.println("\nLinked List is underflow");
			return;
		} else {
			if (head.getData() == data) {
				System.out.println("\n Delete Front data " + head.getData());
				head = head.getNextRef();
				return;
			} else {
				Node tempNode = head.getNextRef();
				Node previousNode = head;
				Node datafoundNode = null;
				Node nextNode = null;
				while (tempNode != null) {
					if (tempNode.getData() == data) {
						datafoundNode = tempNode;
						nextNode = datafoundNode.getNextRef();
						break;
					} else {
						previousNode = tempNode;
						tempNode = tempNode.getNextRef();
					}
				}
				if (datafoundNode != null && nextNode != null) {
					previousNode.setNextRef(nextNode);
					datafoundNode.setNextRef(null);
				} else {
					previousNode.setNextRef(tail);
					datafoundNode.setNextRef(null);
					tail = previousNode;
				}
			}
		}

	}

	public void reverseLinkedList(){
		  if (head ==null){
			  System.out.println("\n Linked List is under flow");
		  }else{
			  Node currentNode = head;
			  Node previousNode = null;
			  Node nextNode = null;
			    while (currentNode!=null){
			    	nextNode = currentNode.getNextRef();
			    	currentNode.setNextRef(previousNode);
			    	previousNode =currentNode;
			    	currentNode = nextNode;
	    	
			    }
			    head = previousNode;
		  }
	}
	
	
	public void traverse() {
		if (head == null) {
			System.out.println("\nLinked List is underflow");
			return;
		} else {
			Node tempNode = head;
			while (tempNode != null) {
				System.out.print(" " + tempNode.getData());
				tempNode = tempNode.getNextRef();
			}
		}

	}

	public static void main(String[] args) {
		LinkedList06 ll = new LinkedList06();
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
