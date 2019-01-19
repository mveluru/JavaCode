package com.brite.amazon.datastructures.doublelinkedlist;

public class DoubleNodeImpl06 {
	DoubleNode head;

	// push in front
	public void push(int data) {
		DoubleNode newNode = new DoubleNode(data);
		if (head == null) {
			head = newNode;
			head.setNextref(null);
			head.setPrevref(null);
		} else {

			newNode.setPrevref(null);
			newNode.setNextref(head);
			head.setPrevref(newNode);
			head = newNode;

		}
	}

	public void InsertAfter(DoubleNode prevNode, int data) {
		DoubleNode newNode = new DoubleNode(data);
		if (prevNode == null) {
			return;
		} else {
			DoubleNode nextNode = prevNode.getNextref();

			prevNode.setNextref(newNode);
			newNode.setPrevref(prevNode);
			newNode.setNextref(nextNode);
			nextNode.setPrevref(newNode);

		}
	}

	public void deleteNode(int data) {
		if (head == null) {
			return;
		} else {
			if (head.getData() == data) {
				System.out.print(" \nDeleted Head Node" + data);
				head = head.getNextref();
				head.setPrevref(null);
				return;
			} else {
				DoubleNode tempNode = head.getNextref();
				DoubleNode previousNode = head;
				DoubleNode nextNode = null;
				DoubleNode datafoundNode = null;
				while (tempNode != null) {
					if (tempNode.getData() == data) {
						datafoundNode = tempNode;
						nextNode = datafoundNode.getNextref();
						break;
					} else {
						previousNode = tempNode;
						tempNode = tempNode.getNextref();
					}
				}
				if (nextNode != null) {
					previousNode.setNextref(nextNode);
					nextNode.setPrevref(previousNode);
				} else {
					previousNode.setNextref(null);
				}
				System.out.println(" \nDeleted Node " + data);
				datafoundNode.setNextref(null);
				datafoundNode.setPrevref(null);
			}
		}
	}

	public void traversal() {
		DoubleNode tempNode = head;
		DoubleNode lastNode = null;
		System.out.println(" \nPrint Forward");
		while (tempNode != null) {
			System.out.print(" " + tempNode.getData());
			lastNode = tempNode;
			tempNode = tempNode.getNextref();
		}
		System.out.println(" \nPrint Backwards");
		while (lastNode != null) {
			System.out.print(" " + lastNode.getData());
			lastNode = lastNode.getPrevref();
		}
	}

	public static void main(String[]args) {
		DoubleNodeImpl06 dll = new DoubleNodeImpl06();
		dll.push(7);
		dll.push(8);
		dll.push(9);
		dll.push(0);
		dll.push(1);
		dll.push(10);
		dll.push(11);
		dll.push(12);
		dll.push(13);
		dll.traversal();
		dll.InsertAfter(dll.head.getNextref(), 20);
		// Insert 1 at the beginning. So linked list becomes 1->7->6->NULL

		dll.traversal();
		dll.deleteNode(7);
		dll.deleteNode(8);
		dll.traversal();
	}
}
