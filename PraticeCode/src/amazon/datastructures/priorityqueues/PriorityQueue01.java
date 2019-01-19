package com.brite.amazon.datastructures.priorityqueues;

public class PriorityQueue01 {
	PriorityQueueNode head;
    
	// lower the priority --front in the queue
	// Function to push according to priority
	public void push(int data, int priority) {
		PriorityQueueNode newNode = new PriorityQueueNode(data, priority);
		if(head ==null){
			
			head = newNode;
			head.setNextRef(null);
			return;
		}else{
			if (head.getPriority()> priority){			
						// Insert New Node before head  
				newNode.setNextRef(head);
				head = newNode;
				
			}else if (head.getPriority()< priority){
				 // Traverse the list and find a  
		        // position to insert new node  
				PriorityQueueNode tempNode = head.getNextRef();
				PriorityQueueNode previousNode = head;
				while(tempNode!=null && tempNode.getPriority() < priority){
					previousNode = tempNode;
					tempNode = tempNode.getNextRef();
					
				}
				
				previousNode.setNextRef(newNode);
				newNode.setNextRef(tempNode);
				
			}
		}

	}

	// Removes the element with the
	// highest priority form the list
	public void traverse() {
		PriorityQueueNode tempNode = head;
		while(tempNode !=null){
			System.out.print(" "+tempNode.getData());
			tempNode = tempNode.getNextRef();
		}

	}

	public int peek(PriorityQueueNode head) {
		return head.getData();
	}

	public int isEmpty(PriorityQueueNode head) {
		return ((head) == null) ? 1 : 0;
	}
	
	public static void main(String[] args){
		PriorityQueue01 pq = new PriorityQueue01();
		pq.push(10, 7);
		pq.push(9, 4);
		pq.push(4, 1);
		pq.push(8, 5);
		pq.push(5, 2);
		pq.push(6, 3);
		pq.push(7, 0);
		pq.traverse();
		
	}
}
