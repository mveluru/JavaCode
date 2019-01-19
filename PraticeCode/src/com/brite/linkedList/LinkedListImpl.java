package com.brite.linkedList;

public class LinkedListImpl {

	private Node headNode;
	private Node tailNode;

	public Node getHeadNode() {
		return headNode;
	}

	public void setHeadNode(Node headNode) {
		this.headNode = headNode;
	}

	public Node getTailNode() {
		return tailNode;
	}

	public void setTailNode(Node tailNode) {
		this.tailNode = tailNode;
	}

	public void insertData(int data) {
		Node newNode = new Node(data);
		if (headNode == null) {
			headNode = newNode;
			tailNode = newNode;
			System.out.println("Head Node Data Inserted " + headNode.getData());
		} else {
			tailNode.setNextRef(newNode);
			tailNode = newNode;
		}

	}

	public void deletefront(){
		Node tempNode = headNode;
		if(tempNode == null){
			tailNode=null;
		}else{
			System.out.println("Deleting.."+ tempNode.getData());
			headNode = tempNode.getNextRef();
		
		}
		
	}
	
	
	public void deleteAfter(int data) {
		Node tempNode = headNode;
		Node refNode = null;
		while (true) {
			if (tempNode == null) {
				System.out.println("No data found");
				break;
			}

			if (tempNode.getData() == data) {
				refNode = tempNode;
				break;
			}
			tempNode =tempNode.getNextRef();
		}
		// de Link the reference
		if(refNode !=null){
			tempNode = refNode.getNextRef();
			refNode.setNextRef(tempNode.getNextRef());
			if(refNode.getNextRef()==null){
				refNode=getTailNode();
			}
			System.out.println("Deleted.."+ tempNode.getData());
		}else {
            System.out.println("Unable to find the given element...");
        }
	}

	public void traverse() {
		Node tempNode = headNode;

		while (true) {
			if (tempNode == null) {
				break;
			} else {
				System.out.println(tempNode.getData());
				tempNode = tempNode.getNextRef();
			}
		}

	}

	public static void main(String[] args) {
		
		LinkedListImpl linkedList = new LinkedListImpl();
		linkedList.insertData(3);
		linkedList.insertData(33);
		linkedList.insertData(34);
		linkedList.insertData(93);
		linkedList.insertData(36);
		linkedList.deleteAfter(34);
		linkedList.deletefront();
		
		linkedList.traverse();
	}
}
