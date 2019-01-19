package com.brite.amazon.datastructures.linkedlist;

public class LinkedList13 {
  Node head;
  Node tail;
  int size;
  
  public void insertData(int data){
	  Node newNode = new Node(data);
	  
	  if (head == null){
		  head = newNode;
		  tail = newNode;
		  this.size++;
	  }else{
		  tail.setNextRef(newNode);
		  tail = newNode;
		  this.size++;
	  }
	  
  }
  public void insertAfter(int data){
	  Node newNode = new Node(data);
	  if(head ==null){
		  head = newNode;
		  tail = newNode;
		  this.size++;
	  }else{
		  newNode.setNextRef(head);
		  head = newNode;
		  this.size++;
	  }
	  
  }
  public void deleteFront(){
	  if(head == null){
		  System.out.println("Under Flow");
		  return;
	  }else{
		  System.out.println(" Delete Head Node " +head.getData());
		  head = head.getNextRef();
		  this.size--;
	  }
	  
  }
  public void deleteData(int data){
	  if (head == null){
		  System.out.println("Under Flow");
		  return;
	  }else{
		  if (head.getData()==data){
			  System.out.println(" Delete Head Data "+head.getData());
			  head = head.getNextRef();
			  this.size--;
		  }else{
			  Node tempNode = head.getNextRef();
			  Node previousNode = head;
			  Node datafoundNode = null;
			  Node nextNode = null;
			  while (tempNode != null){
				  if (tempNode.getData()== data){
					  datafoundNode = tempNode;
					  nextNode = datafoundNode.getNextRef();
					  break;
				  }else{
					  previousNode = tempNode;
					  tempNode = tempNode.getNextRef();
				  }
			  }
			  if (nextNode !=null){
				  
				  previousNode.setNextRef(nextNode);
				  this.size--;
				  
			  }else{
				  previousNode.setNextRef(tail);
				  tail = previousNode;
				  this.size--;
			  }
			  System.out.println(" \n Deleted data "+datafoundNode.getData());
			  datafoundNode.setNextRef(null);
		  }
	  }
	  
  }
  public void reversedLinkedList(){
	  Node currentNode = head;
	  Node previousNode = null;
	  Node nextNode = null;
	  while(currentNode!= null){
		nextNode = currentNode.getNextRef();
		currentNode.setNextRef(previousNode);
		previousNode = currentNode;
		currentNode = nextNode;
		
	  }
	  head = previousNode;
	  
  }
  public void traverse(){
	  Node tempNode = head;
	  while (tempNode !=null){
		  System.out.print(" "+tempNode.getData());
		  tempNode = tempNode.getNextRef();
	  }
	  
  }
  public void bubbleSort(){
	  for (int m = size-1;m>=0;m--){
		  Node tempNode = head;
		  Node nextNode = head.getNextRef();
		  for(int i = 0;i<size;i++){
			  if(tempNode.getData()>nextNode.getData()){
				  int tempData = tempNode.getData();
				  tempNode.setData(nextNode.getData());
				  nextNode.setData(tempData);
			  }
			  tempNode = nextNode;
			  nextNode = nextNode.getNextRef();
		  }
	  }
	  
	  
  }
  public static void main(String[] args) {
	LinkedList13 ll = new LinkedList13();
	ll.insertData(100);
	ll.insertData(22);
	ll.insertData(22);
	ll.insertData(53);
	ll.insertData(40);
	ll.insertData(41);
	ll.insertData(38);
	ll.insertData(26);
	ll.insertData(34);
	ll.insertData(30);
	ll.insertAfter(18);
	ll.insertAfter(15);
	ll.insertAfter(12);
	ll.insertAfter(19);
	System.out.print(" \n Traversing \n");
	ll.traverse();
	
	
	System.out.println("\n Reversed Linked List ");
	ll.reversedLinkedList();
	
	ll.traverse();
	ll.deleteData(12);
	System.out.print(" \n Traversing \n");
	ll.traverse();
	//System.out.println("\n Bubble Sort");
	//ll.bubbleSort();
	//ll.traverse();
}
}
