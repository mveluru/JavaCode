package com.brite.amazon.datastructures.doublelinkedlist;


public class LinkedList_Double {

	DLLNode head;

	// Adding a node at the front of the list
	public void push(int data) {
		DLLNode newNode = new DLLNode(data);

		newNode.next = head;
		newNode.prev = null;

		if (head != null) {
			head.prev = newNode;
		}
		head = newNode;
	}

	/* Given a node as prev_node, insert a new node after the given node */
	public void insertAfter(DLLNode node, int data) {
		DLLNode newNode = new DLLNode(data);

		if (node == null) {
			return;
		}
		newNode.next= node.next;
		node.next=newNode;
		newNode.prev= node;
		if (newNode.next!=null){
			newNode.next.prev = newNode;
		}
		
		
		
	}

	public void append(int data) {

	}

	// This function prints contents of linked list starting from the given node
	public void travese() {
		DLLNode tempNode = head;
		DLLNode last = null;
		System.out.println("Traversal in forward Direction");
		while (tempNode != null) {
			System.out.print(tempNode.data + " ");
			last = tempNode;
			tempNode = tempNode.next;
		}
		System.out.println();
		System.out.println("Traversal in reverse direction");
		while (last != null) {
			System.out.print(last.data + " ");
			last = last.prev;
		}
	}

	public static void main(String[] args) {
		LinkedList_Double dll = new LinkedList_Double();

		dll.push(1);
		dll.push(3);

		dll.insertAfter(dll.head, 8);
		dll.insertAfter(dll.head, 9);

		System.out.println("Created DLL is: ");
		dll.travese();

	}
}
