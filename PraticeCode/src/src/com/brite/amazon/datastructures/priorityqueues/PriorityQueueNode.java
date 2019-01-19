package com.brite.amazon.datastructures.priorityqueues;

public class PriorityQueueNode {
	
	private int data;
	private int priority; 
	private PriorityQueueNode nextRef;
	
	PriorityQueueNode(int data,int priority){
		this.data = data;
		this.priority = priority;
	}

	/**
	 * @return the data
	 */
	public int getData() {
		return data;
	}

	/**
	 * @return the priority
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * @return the nextRef
	 */
	public PriorityQueueNode getNextRef() {
		return nextRef;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(int data) {
		this.data = data;
	}

	/**
	 * @param priority the priority to set
	 */
	public void setPriority(int priority) {
		this.priority = priority;
	}

	/**
	 * @param nextRef the nextRef to set
	 */
	public void setNextRef(PriorityQueueNode nextRef) {
		this.nextRef = nextRef;
	}

}
