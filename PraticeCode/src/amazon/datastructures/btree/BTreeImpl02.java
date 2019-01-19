package com.brite.amazon.datastructures.btree;

public class BTreeImpl02 {
	BstNode root;

	public void insert(int data) {

		if (root == null) {
			BstNode newNode = new BstNode(data);
			System.out.println(" -> inserted: " + data);
			root = newNode;
			root.setLeft(null);
			root.setRight(null);
			return;
		} else {
			BstNode newNode = new BstNode(data);
			BstNode tmpNode = root;
			System.out.print(" ->" + tmpNode.getData());
			while (tmpNode != null) {
				if (tmpNode.getData() >= data) {
					System.out.print(" [L]" + tmpNode.getData());
					if (tmpNode.getLeft() != null) {
						tmpNode = tmpNode.getLeft();
					} else if (tmpNode.getLeft() == null) {
						tmpNode.setLeft(newNode);
						newNode.setLeft(null);
						newNode.setRight(null);
						System.out.println(" -> inserted: " + newNode.getData());
						return;

					}

				} else if (tmpNode.getData() < data) {
					System.out.print(" [R]" + tmpNode.getData());
					if (tmpNode.getRight() != null) {
						tmpNode =tmpNode.getRight();

					} else if (tmpNode.getRight() == null) {
						tmpNode.setRight(newNode);
						newNode.setLeft(null);
						newNode.setRight(null);
						System.out.println(" -> inserted: " + newNode.getData());
						return;

					}

				}
			}
		}

	}

	public boolean bstSearch(BstNode root, int data) {
		if (root == null) {
			return false;
		}
		if (root.getData() == data) {
			return true;
		}
		return bstSearch(root.getLeft(), data)
				|| bstSearch(root.getRight(), data);

	}

	public void preOrderTree(BstNode node) {
		if (node == null)
			return;
		System.out.print(" " + node.getData());
		preOrderTree(node.getLeft());
		preOrderTree(node.getRight());
	}

	public void inOrderTree(BstNode node) {
		if (node == null)
			return;
		inOrderTree(node.getLeft());
		System.out.print(" " + node.getData());
		inOrderTree(node.getRight());

	}

	public void postOrderTree(BstNode node) {
		if (node == null)
			return;
		postOrderTree(node.getLeft());
		postOrderTree(node.getRight());
		System.out.print(" " + node.getData());

	}

	public int findheightOfTree(BstNode root) {
		return getNodeHeight(root);
	}

	public int getNodeHeight(BstNode root) {
		if (root == null) {
			return 0;
		} else {
			return Math.max(getNodeHeight(root.getLeft()),
					getNodeHeight(root.getRight())) + 1;
		}
	}

	public void printTree() {
		System.out.println("\nPRE ORDER topdown \n");
		preOrderTree(this.root);
		System.out.println("\nIN ORDER \n");
		inOrderTree(this.root);
		System.out.println("\nPOST ORDER --Bottom UP \n");
		postOrderTree(this.root);

	}

	public static void main(String[] args) {
		BTreeImpl02 btree = new BTreeImpl02();

		btree.insert(10);
		btree.insert(20);
		btree.insert(21);
		btree.insert(8);
		btree.insert(6);
		btree.insert(16);
		btree.insert(23);
		btree.insert(24);
		btree.insert(25);
		btree.insert(26);
		btree.insert(27);
		btree.insert(5);
		btree.insert(4);
		System.out.println("<----------------------------------------------------------->");
		System.out.println("Height of the tree: "
				+ btree.findheightOfTree(btree.root));
		System.out.println(" ");
		btree.printTree();

		System.out.println("\n data Found  " + btree.bstSearch(btree.root, 27));
		System.out.println("\n data Found  " + btree.bstSearch(btree.root, 50));

	}
}
