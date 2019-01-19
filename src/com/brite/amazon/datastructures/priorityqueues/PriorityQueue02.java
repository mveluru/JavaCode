package com.brite.amazon.datastructures.priorityqueues;

public class PriorityQueue02 {
	PriorityQueueNode head;

	public void insertData(int data, int priority) {
		PriorityQueueNode newNode = new PriorityQueueNode(data, priority);

		// Insert in the front of queue
		if (head == null) {
			head = newNode;
			head.setNextRef(null);
			return;

		}
		// Insert in the front of queue
		if (head.getPriority() > priority) {
			newNode.setNextRef(head);
			head = newNode;
			return;

		} else if (head.getPriority() < priority) {
			// insert at the end of queue
			PriorityQueueNode previousNode = head;
			PriorityQueueNode tempNode = head.getNextRef();

			while (tempNode != null) {
				// insert in the front of queue
				if (tempNode.getPriority() > priority) {

					previousNode.setNextRef(newNode);
					newNode.setNextRef(tempNode);
					break;

				} else if (tempNode.getPriority() < priority) {
					// insert later of the queue
					previousNode = tempNode;
					tempNode = tempNode.getNextRef();
				}
			}
		}
	}

	public void traverse() {
		PriorityQueueNode tempNode = head;
		while (tempNode != null) {
			System.out.print(" " + tempNode.getData());
			tempNode = tempNode.getNextRef();
		}

	}

	public int peek() {

		return this.head.getData();
	}

	private int isEmpty() {
		return ((head) == null) ? 1 : 0;

	}

	public static void main(String[] args) {
		PriorityQueue02 pq = new PriorityQueue02();
		pq.insertData(10, 7);
		pq.insertData(9, 4);
		pq.insertData(4, 1);
		pq.insertData(8, 5);
		pq.insertData(5, 2);
		pq.insertData(6, 3);
		pq.insertData(7, 0);
		pq.traverse();
	}
}