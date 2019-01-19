package com.brite.amazon.datastructures.doublelinkedlist;

public class DoubleNodeImpl03 {
	DoubleNode head;
	
	// Insert the front
	public void push(int data){
		DoubleNode newNode = new DoubleNode(data);
		if (head == null){
			head = newNode;
			head.setPrevref(null);
			head.setNextref(null);
			System.out.println( " Inserted "+data);
		}else{
			head.setPrevref(newNode);
			newNode.setNextref(head);
			newNode.setPrevref(null);
			head = newNode;
			System.out.println( " Inserted "+data);
		}
			
		
	}
		
   public void InsertAfter(DoubleNode prevNode , int data){
	   DoubleNode newNode = new DoubleNode(data);
	   if (prevNode == null){
		   System.out.println("Can't insert data");
		   return;
	   }
	   DoubleNode nextNode = prevNode.getNextref();
		prevNode.setNextref(newNode);
		newNode.setPrevref(prevNode);
		newNode.setNextref(nextNode);
		nextNode.setPrevref(prevNode);
	   
   }
   
   public void deleteData(int data){
	   if (head == null){
		   System.out.println("Can't Delete data Node are empty");
		   return;
	   }
	   if (head.getData()==data){
		   System.out.println("\n Delete Data "+data);
		   head = head.getNextref();
		   head.setPrevref(null);
	   }else{
		   DoubleNode tempNode  = head.getNextref();
		   DoubleNode previousNode = head;
		   DoubleNode nextNode = null;
		   DoubleNode datafoundNode = null;
		    while (tempNode!=null){
		    	if (tempNode.getData()==data){
		    		datafoundNode = tempNode ;
		    		nextNode = datafoundNode.getNextref();
		    		break;
		    	}else{
		    		previousNode = tempNode;
		    		tempNode = tempNode.getNextref();
		    	}
		    }
		    if (nextNode != null){
		    	previousNode.setNextref(nextNode);
		    	nextNode.setPrevref(previousNode);
		    	
		    }else{
		    	previousNode.setNextref(null);
		    	
		    }
		    System.out.println(" \n Delete Data "+datafoundNode.getData());
		    datafoundNode.setNextref(null);
	    	datafoundNode.setPrevref(null);
		    
	   }
	   
	   
   }
   
   public void traversal(){
	   DoubleNode tempNode = head;
	   DoubleNode lastNode = null;
	   System.out.println( "\n forward Printing ");
	   while (tempNode != null){
		   System.out.print(" " + tempNode.getData());
		   lastNode = tempNode;
		   tempNode = tempNode.getNextref();
	   }
	   
	   System.out.println("\n Back ward Printing");
	   while (lastNode!=null){
		   System.out.print(" "+lastNode.getData());
		   lastNode = lastNode.getPrevref();
	   }
	   
   }
   
   public static void main(String[] args) {
	   DoubleNodeImpl03 dll = new DoubleNodeImpl03();
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
