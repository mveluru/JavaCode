package com.brite.amazon.datastructures.main;

public class Btree {
	private Btree left;
	private Btree right;
	private Integer data;

	public Btree getLeft() {
		return left;
	}

	public void setLeft(Btree left) {
		this.left = left;
	}

	public Btree getRight() {
		return right;
	}

	public void setRight(Btree right) {
		this.right = right;
	}

	public Integer getData() {
		return data;
	}

	public void setData(Integer data) {
		this.data = data;
	}

}
