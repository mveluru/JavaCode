package com.brite.amazon.datastructures.priorityqueues;

public class PriorityQueue03 {
	PriorityQueueNode head;
	
	public void insertData(int data,int priority){
		PriorityQueueNode newNode = new PriorityQueueNode(data, priority);
		if (head ==null){
			head = newNode;
			head.setNextRef(null);
			return;
			
		}else{
			// Insert in the front of queue
			if (head.getPriority()> priority){
				newNode.setNextRef(head);
				head = newNode;
				
			}else if (head.getPriority()< priority){
				//Insert after head node 
				  PriorityQueueNode tempNode = head.getNextRef();
				  PriorityQueueNode previousNode = head;
				  while (tempNode !=null){
					// Insert in the front of tempNode
					  if (tempNode.getPriority()> priority){
						  previousNode.setNextRef(newNode);
						  newNode.setNextRef(tempNode);
						  break;
						  
					  }else if (tempNode.getPriority()< priority){
						  // Insert after tempNode;
						  previousNode = tempNode;
						  tempNode = tempNode.getNextRef();
						  
					  }
				  }
				  
			}
			
		}
		
	}
	
	public void traverse(){
		 PriorityQueueNode tempNode = head;
		 while (tempNode != null){
			 System.out.print(" "+tempNode.getData());
			 tempNode = tempNode.getNextRef();
		 }
	}

	public static void main(String[] args) {
		PriorityQueue03 pq = new PriorityQueue03();
		pq.insertData(10, 7);
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
