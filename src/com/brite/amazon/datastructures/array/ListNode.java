package com.brite.amazon.datastructures.array;

public class ListNode {
	int val;
	/**
	 * @return the val
	 */
	public int getVal() {
		return val;
	}
	/**
	 * @param val the val to set
	 */
	public void setVal(int val) {
		this.val = val;
	}
	/**
	 * @return the next
	 */
	public ListNode getNext() {
		return next;
	}
	/**
	 * @param next the next to set
	 */
	public void setNext(ListNode next) {
		this.next = next;
	}
	ListNode next;
	ListNode(int x){
		this.val=x;
	}

}
