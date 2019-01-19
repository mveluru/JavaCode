package com.brite.amazon;

public class Solution {
    ListNode head;
    ListNode tail;
   
	public void insertData(int data){
		ListNode newNode = new ListNode(data);
		if (head==null){
			head = newNode;
			tail = newNode;
		}else{
			tail.setNext(newNode);
			tail = newNode;
		}
	}
	
	
	
	public ListNode reversedLinkedList(ListNode head){
		if (head == null){
			return null;
		}
		ListNode currentNode = head;
		ListNode previousNode =null;
		ListNode nextNode = null;
		while(currentNode !=null){
			nextNode =currentNode.getNext();
			currentNode.setNext(previousNode);
			previousNode = currentNode;
			currentNode = nextNode;
		}
		head = previousNode;
		return head;
	}
	
	public int traverse(ListNode head){
		ListNode tempNode = head;
		StringBuffer sb= new StringBuffer();
		while(tempNode !=null){
			sb.append(Integer.toString(tempNode.getVal()));
			
			tempNode = tempNode.getNext();
		}
		
		return Integer.parseInt(sb.toString());
	}
	public void traverse1(ListNode head){
		ListNode tempNode = head;
		
		while(tempNode !=null){
		
			System.out.print(" "+tempNode.getVal());
			tempNode = tempNode.getNext();
		}
		
		
	}
	
	public ListNode addTwoNumbers(ListNode l1 ,ListNode l2){
		int l12Int = traverse(reversedLinkedList(l1))+traverse(reversedLinkedList(l2));

		ListNode head = null;
		ListNode tail = null;
		while (l12Int!=0){
		
			
			ListNode newNode = new ListNode(l12Int%10);
			if (head==null){
				head = newNode;
				tail = newNode;
			}else{
				tail.setNext(newNode);
				tail = newNode;
			}							
			
			l12Int=l12Int/10;
		}
		traverse1(head);
		return head;
	}
	


	public void createNode(){
		Solution s1 = new Solution();
		s1.insertData(2);
		s1.insertData(4);
		s1.insertData(3);
		
		
		
		Solution s2 = new Solution();
		s2.insertData(5);
		s2.insertData(6);
		s2.insertData(4);
		addTwoNumbers(s1.head ,s2.head);
		
		
	}
	public static void main(String[] args){
		Solution s1 = new Solution();
		s1.createNode();
		
		
	}
}
