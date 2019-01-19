package com.brite.amazon.datastructures.linkedlist;

import com.brite.amazon.datastructures.linkedlist.Node;

public class LinkedList03 {

	private Node head;
	private Node tail;

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
			System.out.println("Under Flow");
			return;
		} else {
			System.out.println("Delete Front data " + head.getData());
			head = head.getNextRef();
		}

	}

	public void deleteData(int data) {
		if (head == null) {
			System.out.println("Under flow");
			return;
		} else {
			if (head.getData() == data) {
				System.out.println("Deleted Data " + head.getData());
				head = head.getNextRef();
				return;
			} else {
				Node tempNode = head.getNextRef();
				Node datafoundNode = null;
				Node previousNode = head;
				while (tempNode != null) {
					if (tempNode.getData() == data) {
						datafoundNode = tempNode;
						break;
					} else {
						previousNode = tempNode;
						tempNode = tempNode.getNextRef();
					}
				}
				if (datafoundNode != null) {
					System.out.println("Deleted data "+datafoundNode.getData());
					Node tmpNode = datafoundNode.getNextRef();
					previousNode.setNextRef(tmpNode);
					Node tnode = null;
					datafoundNode.setNextRef(tnode);
				} else {
					previousNode.setNextRef(tail);
					
					tail = previousNode.getNextRef();
				}

			}

		}
	}

	public void traverse() {
		if (head == null) {
			System.out.println("Under flow");
		} else {
			Node tempNode = head;
			while (tempNode != null) {
				System.out.print(" " + tempNode.getData());
				tempNode = tempNode.getNextRef();
			}
		}
	}

	public void reverseIterative(){
		Node currNode = head;
		Node nextNode = null;
		Node prevNode = null;

		while(currNode!=null){
			nextNode = currNode.getNextRef();
			currNode.setNextRef(prevNode);
			prevNode = currNode;
			currNode = nextNode;
		}
		head = prevNode;
	}
	
	
	public static void main(String[] args) {

		LinkedList03 ll = new LinkedList03();
		ll.insertData(200);
		ll.insertData(11);
		ll.insertData(12);
		ll.insertData(13);
		ll.insertData(14);
		ll.insertData(15);
		ll.insertData(16);
		ll.traverse();
		System.out.println();
		//ll.deleteFront();
		System.out.println();
		
		ll.deleteData(11);
		ll.traverse();
		System.out.println("\nReverse Linked List");
		ll.reverseIterative();
		ll.traverse();

	}
}
