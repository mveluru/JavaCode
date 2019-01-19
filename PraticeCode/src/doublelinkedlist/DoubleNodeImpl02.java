package com.brite.amazon.datastructures.doublelinkedlist;

public class DoubleNodeImpl02 {
	DoubleNode head;
	
	/*
	 * insert Data at before/begin at head Node
	 */
	public void push(int data){
		DoubleNode  newNode = new DoubleNode(data);
		if (head == null){
			System.out.println("\nInserted head data "+data);
			head = newNode;
			newNode.setNextref(null);
			newNode.setPrevref(null);
			return;
		}else{
			head.setPrevref(newNode);
			newNode.setNextref(head);
			newNode.setPrevref(null);
			head = newNode;
			System.out.println("\nInserted  data "+head.getData());
		}
	}

	public void InsertAfter(DoubleNode prevNode , int data){
		DoubleNode  newNode = new DoubleNode(data);
		if (prevNode ==null){
			System.out.println("\n Cannot insert data \n");
			return;
		}else{
			DoubleNode nextNode = prevNode.getNextref();
			newNode.setNextref(nextNode);
			newNode.setPrevref(prevNode);
			prevNode.setNextref(newNode);
			nextNode.setPrevref(newNode);
			
		}
		
		
	}
	
	public void deleteData(int data){
		if (head == null){
			System.out.println("\nNo Data can be deleted");
			return;
		}else if (head.getData()== data){
			
			System.out.println("\nDelete head data ..."+head.getData());
			head= head.getNextref();
			head.setPrevref(null);
			return;
			
		}else{
			 DoubleNode  tempNode = head.getNextref();
			 DoubleNode  previousNode = head;
			 DoubleNode  nextNode = null;
			 DoubleNode  datafoundNode = null;
			 while (tempNode!=null){
				 if (tempNode.getData()==data){
					 datafoundNode = tempNode;
					 previousNode = datafoundNode.getPrevref();
					 nextNode = datafoundNode.getNextref();
					 break; 
				 }else{
					 previousNode = tempNode;
					 tempNode = tempNode.getNextref();
				 }
			 }
			 
			 if (nextNode!=null){
				 System.out.println(" Deleted Data "+ datafoundNode.getData());
				 previousNode.setNextref(nextNode);
				 nextNode.setPrevref(previousNode);
			 }else{
				 System.out.println(" \n Deleted Data "+ datafoundNode.getData());
				 previousNode.setNextref(null);
			 }
		}
		
	}
	
	public void traversal(){
		if(head == null){
			System.out.println("\n No Data found");
		}else{
			DoubleNode tempNode = head;
			DoubleNode lastNode =null;
			System.out.println(" \nForward printing ...\n");
			while(tempNode !=null){
				System.out.print(" "+tempNode.getData());
				lastNode = tempNode;
				tempNode = tempNode.getNextref();
				
			}
			
			System.out.println(" \nBackWard printing ...\n");
			while(lastNode!= null){
				System.out.print(" "+lastNode.getData());
				lastNode = lastNode.getPrevref();
			}
		}
	}
	
	public static void main(String[] args) {
		DoubleNodeImpl02 dll = new DoubleNodeImpl02();
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
