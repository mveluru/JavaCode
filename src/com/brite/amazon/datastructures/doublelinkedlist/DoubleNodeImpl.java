package com.brite.amazon.datastructures.doublelinkedlist;

public class DoubleNodeImpl {
	
	DoubleNode head;
	
	// Adding a node at the front of the list 
	private  void push(int data){
		DoubleNode newNode = new DoubleNode(data);
		if (head == null){
			head = newNode;
			head.setPrevref(null);
			head.setNextref(null);
		}else{
			DoubleNode tempNode = head.getPrevref();
			tempNode = newNode;
			newNode.setPrevref(null);
			newNode.setNextref(head);
			head.setPrevref(newNode);
			head = newNode;
		}
		
		
		
	}

	
	private void InsertAfter(DoubleNode prevNode , int data){
		if (prevNode == null){
			return;
		}
		DoubleNode newNode = new DoubleNode(data);
		DoubleNode  tempNode = prevNode.getNextref();
		prevNode.setNextref(newNode);
		newNode.setNextref(tempNode);
		tempNode.setPrevref(newNode);
		newNode.setPrevref(prevNode);
	}
	
	private void deleteData(int data){
		if (head ==null){
			return;
		}
		if (head.getData()== data){
			head = head.getNextref();
			head.setPrevref(null);
			return;
		}
		DoubleNode tempNode = head.getNextref();
		DoubleNode  prevNode = null;
		DoubleNode  nextNode = null;
		DoubleNode dataFoundNode=null;
		while (tempNode !=null){
			 if (tempNode.getData()==data){
				 dataFoundNode =tempNode;
				 prevNode = dataFoundNode.getPrevref();
				 nextNode = dataFoundNode.getNextref();
				 break;
			 }else{
				 tempNode = tempNode.getNextref();
			 }	
		}
		 System.out.println("\nDeleted Data "+dataFoundNode.getData());
		 if (nextNode !=null){
			 prevNode.setNextref(nextNode);
			 nextNode.setPrevref(prevNode);
		 }else{
			 prevNode.setNextref(nextNode);//null
		 }
		 
		
		
	}
	
	// This function prints contents of linked list starting from the given node 
	public void traversal() {
		DoubleNode tempNode = head;
		DoubleNode last = null;
		System.out.println("\nTraversal in forward Direction");
		while (tempNode != null) {
			System.out.print(tempNode.getData() + " ");
			last = tempNode;
			tempNode = tempNode.getNextref();
		}
		System.out.println();
		System.out.println("\nTraversal in reverse direction");
		while (last != null) {
			System.out.print(last.getData() + " ");
			last = last.getPrevref();
		}
	}
	
	public static void main(String[] args) {
		DoubleNodeImpl dll = new DoubleNodeImpl();
			dll.push(7); 
			dll.push(8); 
			dll.push(9); 
			dll.push(0); 
			dll.push(1);
			dll.push(10); 
			dll.push(11); 
			dll.push(12);
			dll.push(13);
		    dll.InsertAfter(dll.head.getNextref(), 20);
	        // Insert 1 at the beginning. So linked list becomes 1->7->6->NULL 
	         
	        dll.traversal();
	        dll.deleteData(7);
	        dll.traversal();
		
	}
}
