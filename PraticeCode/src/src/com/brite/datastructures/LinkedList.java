package com.brite.datastructures;

import com.brite.model.Employee;

public class LinkedList {
	
	private EmployeeNode head;
	
	public void addToFront(Employee employee){
		EmployeeNode node = new EmployeeNode(employee);
		node.setNext(head);
		head=node;
		
	}
  public void printList(){
	  EmployeeNode current = head;
	  while(current !=null){
		  System.out.print(current);
		  System.out.print("->");
	  }
	  
  }
}
