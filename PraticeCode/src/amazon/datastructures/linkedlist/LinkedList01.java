package com.brite.amazon.datastructures.linkedlist;

import com.brite.amazon.datastructures.linkedlist.Node;

public class LinkedList01 {
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

	public void deletefront() {
		if (head == null) {
			System.out.println("Linked List Underflow");
		} else {
			Node temp = head;
			head = head.getNextRef();
			if (head == null) {
				tail = head;
			}
			System.out.println("Deleted " + temp.getData());
		}
	}

	public void deleteData(int data) {
		if (head == null) {
			System.out.println("Linked List Underflow");
		} else {

			if (head.getData() == data) {
				System.out.println("Delete Data " + data);
				head = head.getNextRef();

			} else {
				Node previous = head;
				Node temp = head.getNextRef();
				Node datafoundNode = null;

				while (temp != null) {
					if (temp.getData() == data) {
						datafoundNode = temp;
						break;
					} else {
						previous = temp;
						temp = temp.getNextRef();
					}
				}
				if (datafoundNode != null) {
					if (datafoundNode.getNextRef() == null) {
						tail=null;
						previous.setNextRef(tail);
					} else {

						previous.setNextRef(datafoundNode.getNextRef());
						datafoundNode.setNextRef(null);
						System.out.println("Delete Data " + data);
					}
				}
			}
		}
	}

	public void traverse() {
		if (head == null) {
			System.out.println("No data found");
		} else {
			Node temp = head;
			while (temp != null) {
				System.out.println(temp.getData());
				temp = temp.getNextRef();
			}
		}

	}

	public static void main(String[] args) {
		LinkedList01 ll = new LinkedList01();
		ll.insertData(200);
		ll.insertData(11);
		ll.insertData(12);
		ll.insertData(13);
		ll.insertData(14);
		ll.insertData(15);
		ll.insertData(16);
		ll.traverse();
		System.out.println();
		// ll.deletefront();
		ll.deleteData(13);
		ll.traverse();
	}

}
