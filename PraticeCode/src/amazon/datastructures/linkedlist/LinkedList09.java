package com.brite.amazon.datastructures.linkedlist;

public class LinkedList09 {
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
			System.out.println("\n No Element found to delete");
			return;
		} else {
			System.out.println(" \nDeleted Front Data " + head.getData());
			head = head.getNextRef();
		}

	}

	public void deleteData(int data) {
		if (head == null) {
			System.out.println("\n Unable to delete");
			return;
		} else {
			if (head.getData() == data) {
				System.out.println("Deleted Front Data " + head.getData());
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
				if (nextNode !=null){
					System.out.println("Deleted the data" +datafoundNode.getData());
					previousNode.setNextRef(nextNode);
					datafoundNode.setNextRef(null);
				}else if (nextNode == null){
					System.out.println("Deleted the data" +datafoundNode.getData());
					previousNode.setNextRef(tail);
					tail = previousNode;
				}
			}
		}

	}

	public void traverse() {
		Node tempNode = head;
		while(tempNode!=null){
			System.out.print(" "+tempNode.getData());
			tempNode = tempNode.getNextRef();
		}

	}

	public void reverseLinkedList() {
		Node currentNode = head;
		Node  previousNode =null;
		Node  nextNode = null;
		while (currentNode !=null){
			nextNode = currentNode.getNextRef();
			currentNode.setNextRef(previousNode);
			previousNode = currentNode;
			currentNode = nextNode;
		}
		head = previousNode;
	}

	public static void main(String[] args) {
		LinkedList09 ll = new LinkedList09();
		ll.insertData(200);
		ll.insertData(11);
		ll.insertData(12);
		ll.insertData(13);
		ll.insertData(14);
		ll.insertData(15);
		ll.insertData(16);
		ll.insertData(18);
		ll.insertData(19);
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
