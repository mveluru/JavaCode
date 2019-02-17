package com.brite.amazon.datastructures.btree;

public class BTreeImpl06 {
	BstNode root;

	public void insertData(int data) {
		BstNode newNode = new BstNode(data);
		if (root == null) {
			System.out.println("input Data-->" + data);
			root = newNode;
			root.setLeft(null);
			root.setRight(null);
		} else {

			BstNode tempNode = root;
			System.out.print(" ->" + tempNode.getData());
			while (tempNode != null) {
				if (tempNode.getData() >= data) {
					System.out.print("[L]" + tempNode.getData());

					if (tempNode.getLeft() != null) {
						tempNode = tempNode.getLeft();
					} else {
						tempNode.setLeft(newNode);
						System.out.println("--> Insert Data " + data);
						break;
					}

				} else if (tempNode.getData() < data) {
					System.out.print("[R]" + tempNode.getData());
					if (tempNode.getRight() != null) {
						tempNode = tempNode.getRight();
					} else {
						tempNode.setRight(newNode);
						System.out.println("--> Insert Data " + data);
						break;
					}

				}

			}
		}

	}

	public void inOrderBtree(BstNode root) {
		if (root == null) {
			return;
		}
		inOrderBtree(root.getLeft());
		System.out.print(" " + root.getData());
		inOrderBtree(root.getRight());

	}
	
	public void postOrderBtree(BstNode root) {
		if(root == null) {
			return;
		}
		postOrderBtree(root.getLeft());
		postOrderBtree(root.getRight());
		System.out.print(" " + root.getData());
	}
	
	public void preOrderBtree(BstNode root){
		if (root ==null){
			return;
		}
		System.out.print(" "+root.getData());
		preOrderBtree(root.getLeft());
		
		preOrderBtree(root.getRight());
		
	}
	public void printTree(){
		System.out.println(" pre order printing");
		preOrderBtree(this.root);
		System.out.println(" \n in order printing");
		inOrderBtree(this.root);
		System.out.println("\n prost order printing");
		postOrderBtree(this.root);
		
	}
	public int getHeightofTree(BstNode root) {
		if(root == null) {
			return 0;
		}
		
		return Math.max(getHeightofTree(root.getLeft()),getHeightofTree(root.getLeft()))+1;
		
	}
	
	public static void main(String[] args) {
		BTreeImpl06 btree = new BTreeImpl06();
		btree.insertData(10);
		btree.insertData(20);
		btree.insertData(21);
		btree.insertData(8);
		btree.insertData(6);
		btree.insertData(16);
		btree.insertData(23);
		btree.insertData(24);
		btree.insertData(25);
		btree.insertData(26);
		btree.insertData(27);
		btree.insertData(5);
		btree.insertData(4);
		System.out.println("-------------------");
		System.out.println("Height of the tree: " + btree.getHeightofTree(btree.root));
		System.out.println(" ");
		btree.printTree();
	}

}
