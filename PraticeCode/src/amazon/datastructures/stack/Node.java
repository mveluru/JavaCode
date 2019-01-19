package com.brite.amazon.datastructures.stack;

public class Node {
	
	int data;
	Node nextRef;
	
	public Node(int data){
		this.data=data;
	}
	
	/**
	 * @return the data
	 */
	public int getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(int data) {
		this.data = data;
	}
	/**
	 * @return the nextRef
	 */
	public Node getNextRef() {
		return nextRef;
	}
	/**
	 * @param nextRef the nextRef to set
	 */
	public void setNextRef(Node nextRef) {
		this.nextRef = nextRef;
	}
	

}
