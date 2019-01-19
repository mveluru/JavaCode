package com.brite.amazon.datastructures.linkedlist;

import com.brite.amazon.datastructures.linkedlist.Node;

public class LinkedList05 {
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
			System.out.println("\nUnder Flow");
			return;
		}
		if (head != null) {
			System.out.println("\nDeleted Front data " + head.getData());
			head = head.getNextRef();
		}

	}

	public void traverse() {
		if (head == null) {
			System.out.println("No Element in the given linked list");
		}
		if (head != null) {
			Node tempNode = head;
			while (tempNode != null) {
				System.out.print(" " + tempNode.getData());
				tempNode = tempNode.getNextRef();
			}
		}
		System.out.println();

	}

	public void deleteData(int data) {
		if (head == null) {
			System.out.println("\nNo Element in the given linked list");
			return;
		}
		if (head.getData() == data) {
			System.out.println("\nDelete Data in the front " + head.getData());
			head = head.getNextRef();
			return;
		} else {
			Node tempNode = head.getNextRef();
			Node previousNode = head;
			Node datafoundNode = null;
			while (tempNode != null) {
				if (tempNode.getData() == data) {
					datafoundNode = tempNode;
					break;
				} else {
					previousNode = tempNode;
					tempNode = tempNode.getNextRef();
				}
			}
			Node tmpNode = datafoundNode.getNextRef();
			if (datafoundNode != null && tmpNode != null) {

				previousNode.setNextRef(tmpNode);
				datafoundNode.setNextRef(null);

			} else {

				previousNode.setNextRef(tail);
				datafoundNode.setNextRef(null);
				tail = previousNode;

			}

		}

	}

	public void reverseLinkedList() {
		if (head == null) {
			System.out.println("\nNo Elemment found");
			return;
		}

		Node currentNode = head;
		Node previouseNode = null;
		Node nextNode = null;
		while (currentNode != null) {
			nextNode = currentNode.getNextRef();
			currentNode.setNextRef(previouseNode);
			previouseNode = currentNode;
			currentNode = nextNode;

		}
		head = previouseNode;
	}

	public static void main(String[] args) {
		LinkedList05 ll = new LinkedList05();
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
