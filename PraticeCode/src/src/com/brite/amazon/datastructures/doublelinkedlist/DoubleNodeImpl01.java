package com.brite.amazon.datastructures.doublelinkedlist;

public class DoubleNodeImpl01 {
	DoubleNode head;
	
	/*
	 * insert before head node
	 */
	public void push(int data){
		DoubleNode newNode = new DoubleNode(data);
		if(head == null){
			head = newNode;
			head.setPrevref(null);
			head.setNextref(null);
			return;
		}else{
			head.setPrevref(newNode);
			newNode.setPrevref(null);
			newNode.setNextref(head);
			head = newNode;
			
		}
		
		
	}
	
	/**
	 * Insert after previousNode
	 * @param prevNode
	 * @param data
	 */
	private void InsertAfter(DoubleNode prevNode , int data){
		DoubleNode newNode = new DoubleNode(data);
		if (prevNode ==null){
			System.out.println("\nCannot Insert Data");
			return;
		}else{
			
			DoubleNode nextNode = prevNode.getNextref();
			newNode.setNextref(nextNode);
			newNode.setPrevref(prevNode);
			prevNode.setNextref(newNode);
			nextNode.setPrevref(newNode);
		}
	
	
	}

	private void deleteData(int data){
		if (head ==null){
			System.out.println("\nNo data found in the list");
			return;
		}
		if(head.getData()==data){
			head =head.getNextref();
			head.setPrevref(null);
			return;
		}else{
			 DoubleNode tempNode = head.getNextref();
			 DoubleNode  previousNode = head;
			 DoubleNode  datafoundNode =null;
			 DoubleNode  nextNode =null;
			 
			 while (tempNode !=null){
				 if(tempNode.getData()==data){
					 datafoundNode = tempNode;
					 previousNode = datafoundNode.getPrevref();
					 nextNode = datafoundNode.getNextref();
					 break;
				 }else{
					 previousNode = tempNode;
					 tempNode = tempNode.getNextref();
				 }
			 }
			 if ( nextNode !=null){
				 previousNode.setNextref(nextNode);
				 nextNode.setPrevref(previousNode);
				 
			 }else{
				 previousNode.setNextref(nextNode);
			 }
			 
			 
		}
		
	
	}
	
	public void traversal() {
		if (head == null){
			System.out.println("No Data in the list");
			return;
		}
		System.out.print("\nForward order Printing \n");
		DoubleNode  tempNode = head;
		DoubleNode lastNode = null;
		while (tempNode!=null){
			System.out.print(" "+tempNode.getData());
			lastNode = tempNode;
			tempNode =tempNode.getNextref();
			
		}
		System.out.println("\nReverse order Printing ");
		while (lastNode!=null){
			System.out.print(" "+lastNode.getData());
			lastNode = lastNode.getPrevref();
		}
	
	}
	
	public static void main(String[] args) {
		
		DoubleNodeImpl01 dll = new DoubleNodeImpl01();
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
