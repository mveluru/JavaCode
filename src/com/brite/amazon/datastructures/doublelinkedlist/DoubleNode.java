package com.brite.amazon.datastructures.doublelinkedlist;

public class DoubleNode {
	 private int data; 
	 private  DoubleNode prevref; 
	 private DoubleNode nextref; 

     // Constructor to create a new node 
     // next and prev is by default initialized as null 
	 DoubleNode(int d) {
	  data = d; }

	/**
	 * @return the data
	 */
	public int getData() {
		return data;
	}

	/**
	 * @return the prevref
	 */
	public DoubleNode getPrevref() {
		return prevref;
	}

	/**
	 * @return the nextref
	 */
	public DoubleNode getNextref() {
		return nextref;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(int data) {
		this.data = data;
	}

	/**
	 * @param prevref the prevref to set
	 */
	public void setPrevref(DoubleNode prevref) {
		this.prevref = prevref;
	}

	/**
	 * @param nextref the nextref to set
	 */
	public void setNextref(DoubleNode nextref) {
		this.nextref = nextref;
	}
	

}
