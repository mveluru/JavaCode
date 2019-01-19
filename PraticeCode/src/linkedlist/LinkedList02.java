package com.brite.amazon.datastructures.linkedlist;

import com.brite.amazon.datastructures.linkedlist.Node;

public class LinkedList02 {
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
			System.out.println("Under flow");
		} else {
			System.out.println("Deleted .." + head.getData());
			Node temp = head.getNextRef();
			head = temp;

		}
	}

	public void deleteData(int data) {
		if (head == null) {
			System.out.println("Under flow");
		} else {
			if (head.getData() == data) {
				System.out.println("Delete Data "+head.getData());
				Node temp = head.getNextRef();
				head = temp;

			} else {
				Node datafoundNode = null;
				Node previousNode = head;
				Node temp = head.getNextRef();
				while (temp != null) {
					if (temp.getData() == data) {
						datafoundNode = temp;
						break;
					} else {
						previousNode = temp;
						temp = temp.getNextRef();
					}
				}
				if (datafoundNode != null) {
					Node tmp = datafoundNode.getNextRef();
					if (tmp != null) {
						System.out.println("Delete Data "+datafoundNode.getData());
						previousNode.setNextRef(tmp);
						Node nullNode = null;
						datafoundNode.setNextRef(nullNode);
					} else if (tmp == null) {

						tail = tmp;
					}

				}

			}

		}
	}

	public void traverse() {
		if (head == null) {
			System.out.println("Under flow");
		} else {
			Node temp = head;
			while (temp != null) {
				System.out.println(temp.getData());
				temp = temp.getNextRef();
			}
		}
	}

	public static void main(String[] args) {
		LinkedList02 ll = new LinkedList02();
		ll.insertData(200);
		ll.insertData(11);
		ll.insertData(12);
		ll.insertData(13);
		ll.insertData(14);
		ll.insertData(15);
		ll.insertData(16);
		ll.traverse();
		//ll.deleteFront();
		//System.out.println();
		//ll.traverse();
		System.out.println();
		ll.deleteData(14);
		ll.traverse();
		
	}

}
