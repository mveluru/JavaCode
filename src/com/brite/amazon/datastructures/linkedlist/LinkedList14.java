package com.brite.amazon.datastructures.linkedlist;

public class LinkedList14 {
	Node head;
	Node tail;
	int size=0;
	
	public void insertAfter(int data){
		Node newNode = new Node(data);
		if (head == null){
			head = newNode;
			tail = newNode;
			size++;
		}else{
			tail.setNextRef(newNode);
			tail=newNode;
			size++;
		}
	}

	public void insertBefore(int data){
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
			tail = newNode;
			size++;
		}else{
			newNode.setNextRef(head);
			head = newNode;
			size++;
		}
	}
	
	public void deleteFront(){
		if(head == null){
			System.out.print(" No data found");
			return;
		}else{
			System.out.print(" Head data deleted"+head.getData());
			head = head.getNextRef();
			size--;
		}
	}
	
	public void deleteData(int data){
		if (head == null){
			System.out.print(" No data found");
			return;
		}else{
			if (head.getData()==data){
				System.out.print(" Head data deleted"+head.getData());
				head = head.getNextRef();
				size--;
			}else{
				Node tempNode = head.getNextRef();
				Node previousNode = head;
				Node nextNode = null;
				while (tempNode != null){
					if (tempNode.getData()==data){
						System.out.print("\n Delete Node "+tempNode.getData());
						nextNode = tempNode.getNextRef();
						size--;
						break;
					}else{
						previousNode = tempNode;
						tempNode = tempNode.getNextRef();
					}
				}
				if(nextNode !=null){
					previousNode.setNextRef(nextNode);
				}else{
					previousNode.setNextRef(tail);
					tail = previousNode;
				}
			}
			
		}
		
		
	}
	
	public void bubbleSort() {

		for (int m = this.size; m >= 0; m--) {
			Node tempNode = head;
			Node nextNode = head.getNextRef();

			for (int i = 0; i < this.size; i++) {

				if (nextNode != null) {

					if (tempNode.getData() > nextNode.getData()) {
						int tempdata = tempNode.getData();
						tempNode.setData(nextNode.getData());
						nextNode.setData(tempdata);
					}
					tempNode = nextNode;
					nextNode = nextNode.getNextRef();

				}

			}
		}
	}
	
	public void reversedLinkedList(){
		Node currentNode = head;
		Node previousNode = null;
		Node nextNode = null;
		while (currentNode !=null){
			nextNode = currentNode.getNextRef();
			currentNode.setNextRef(previousNode);
			previousNode =currentNode;
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
	public static void main(String[] args){
		LinkedList14 ll = new LinkedList14();
		ll.insertAfter(100);
		ll.insertAfter(22);
		ll.insertAfter(22);
		ll.insertAfter(53);
		ll.insertAfter(40);
		ll.insertAfter(41);
		ll.insertAfter(38);
		ll.insertBefore(26);
		ll.insertBefore(34);
		ll.insertBefore(30);
		ll.insertBefore(18);
		ll.insertBefore(15);
		ll.insertBefore(12);
		ll.insertBefore(19);
		/*System.out.print(" \n Bubble Sort \n");
		ll.bubbleSort();*/
		System.out.print(" \n Traversing \n");
		ll.traverse();
		
		
		System.out.println("\n Reversed Linked List ");
		ll.reversedLinkedList();
		
		ll.traverse();
		ll.deleteData(12);
		System.out.print(" \n Traversing \n");
		ll.traverse();
		
	}
}
