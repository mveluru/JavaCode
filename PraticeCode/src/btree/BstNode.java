package com.brite.amazon.datastructures.btree;

public class BstNode {

	private BstNode right;
	private int data;
	private BstNode left;

	BstNode(int data) {
    this.data =data;
	}

	/**
	 * @return the left
	 */
	public BstNode getLeft() {
		return left;
	}

	/**
	 * @param left
	 *            the left to set
	 */
	public void setLeft(BstNode left) {
		this.left = left;
	}

	/**
	 * @return the right
	 */
	public BstNode getRight() {
		return right;
	}

	/**
	 * @param right
	 *            the right to set
	 */
	public void setRight(BstNode right) {
		this.right = right;
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

}
