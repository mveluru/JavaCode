package com.brite.amazon.datastructures.priorityqueues;

public class PriorityQueue06 {
	PriorityQueueNode head;
	
	public void insertData(int data,int priority){
		PriorityQueueNode newNode = new PriorityQueueNode(data,priority);
		if (head == null){
			head = newNode;
			head.setNextRef(null);
			return;
		}else{
			if (head.getPriority()>=priority){
				//insert in the front of head node.
				newNode.setNextRef(head);
				head = newNode;
				return;
			}else if (head.getPriority()<priority){
				PriorityQueueNode tempNode = head.getNextRef();
				PriorityQueueNode previousNode = head;
				
				while (tempNode!=null){
					if (tempNode.getPriority()==priority){
						previousNode.setNextRef(newNode);
						newNode.setNextRef(tempNode);
						break;
					}
					if (tempNode.getPriority()> priority){
						previousNode.setNextRef(newNode);
						newNode.setNextRef(tempNode);
						
						break;
					}else{
						previousNode = tempNode;
						tempNode = tempNode.getNextRef();
					}
				}
				
			}
		}
	}
	public void dequeue(){
		if (head == null){
			System.out.println(" Under flow");
			return;
		}else{
			System.out.println(" \ndequeue "+ head.getData());
			head = head.getNextRef();
		}
	}
	
	public void traverse(){
		if (head == null){
			return;
			
		}else{
			PriorityQueueNode tempNode = head;
			while(tempNode !=null){
				System.out.print(" "+tempNode.getData());
				tempNode = tempNode.getNextRef();
			}
		}
	}
	public static void main(String[] args) {
		PriorityQueue06 pq = new PriorityQueue06();
		pq.insertData(10, 7);
		pq.insertData(11, 7);
		pq.insertData(9, 4);
		pq.insertData(21, 4);
		pq.insertData(4, 1);
		pq.insertData(8, 5);
		pq.insertData(5, 2);
		pq.insertData(6, 3);
		pq.insertData(7, 0);
		pq.traverse();
		pq.dequeue();
		pq.traverse();
	}

}
