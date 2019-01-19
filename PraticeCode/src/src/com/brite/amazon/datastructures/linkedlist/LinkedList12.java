package com.brite.amazon.datastructures.linkedlist;

public class LinkedList12 {
	Node head;
	Node tail;
	int size;

	// queue
	public void insertData(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
			this.size++;

		} else {
			tail.setNextRef(newNode);
			tail = newNode;
			size++;
		}
	}

	// Stack
	public void stack(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			tail = newNode;
			size++;
		} else {
			newNode.setNextRef(head);
			head = newNode;
			size++;
		}
	}

	public void deleteFront() {
		if (head == null) {
			System.out.println(" Under Flow");
			return;
		}
		System.out.println("Delete Front Data" + head.getData());
		head = head.getNextRef();
		this.size--;

	}

	public void deleteData(int data) {
		if (head == null) {
			return;
		} else {
			if (head.getData() == data) {
				System.out.println(" Deleted Head Node " + head.getData());
				head = head.getNextRef();
				size--;
			} else {
				Node tempNode = head.getNextRef();
				Node previousNode = head;
				Node nextNode = null;
				Node datafoundNode = null;
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
				if (nextNode != null) {
					previousNode.setNextRef(nextNode);

				} else {
					previousNode.setNextRef(tail);
					tail = previousNode;
				}
				System.out.println(" \nDelete Data " + data);
				//datafoundNode.setNextRef(null);
				size--;
			}
		}

	}

	public void traverse() {
		Node tempNode = head;
		while (tempNode != null) {
			System.out.print(" " + tempNode.getData());
			tempNode = tempNode.getNextRef();
		}
		System.out.println();
	}

	public void reversedLinkedList() {
		Node currentNode = head;
		Node previousNode = null;
		Node nextNode = null;
		while (currentNode != null) {
			nextNode = currentNode.getNextRef();
			currentNode.setNextRef(previousNode);
			previousNode = currentNode;
			currentNode = nextNode;
		}
		head = previousNode;
	}

	public void bubbleSort() {

		for (int m = this.size; m >= 0; m--) {
			Node tempNode = head;
			Node nextNode = head.getNextRef();

			for (int i = 0; i < this.size; i++) {

				if (nextNode != null) {

					if (tempNode.getData() > nextNode.getData()) {
						int tempdata = tempNode.getData();
						tempNode.setData(nextNode.getData());
						nextNode.setData(tempdata);
					}
					tempNode = nextNode;
					nextNode = nextNode.getNextRef();

				}

			}
		}
	}

	public static void main(String[] args) {
		LinkedList12 ll = new LinkedList12();
		ll.insertData(100);
		ll.insertData(22);
		ll.insertData(22);
		ll.insertData(53);
		ll.insertData(40);
		ll.insertData(41);
		ll.insertData(38);
		ll.insertData(26);
		ll.insertData(34);
		ll.insertData(30);
		ll.stack(18);
		ll.stack(15);
		ll.stack(12);
		ll.stack(19);
		ll.traverse();
		
		
		System.out.println("\n Reversed Linked List ");
		ll.reversedLinkedList();
		ll.traverse();
		ll.deleteData(12);
		System.out.println();
		ll.traverse();
		//System.out.println("\n Bubble Sort");
		//ll.bubbleSort();
		//ll.traverse();
	}
}
