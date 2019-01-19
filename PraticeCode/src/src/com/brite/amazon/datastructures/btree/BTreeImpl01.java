package com.brite.amazon.datastructures.btree;

/*
 *  O(log n)
 */
public class BTreeImpl01 {
	BstNode root;

	public void insert(int data) {
		System.out.print("[input: " + data + "]");

		if (root == null) {
			BstNode newNode = new BstNode(data);
			System.out.println(" -> inserted: " + data);
			this.root = newNode;
			return;
		} else {
			BstNode newNode = new BstNode(data);
			BstNode tmpNode = root;
			System.out.print(" ->" + tmpNode.getData());
			while (tmpNode != null) {
				if (tmpNode.getData() >= data) {
					System.out.print(" [L]" + tmpNode.getData());
					if (tmpNode.getLeft() == null) {
						tmpNode.setLeft(newNode);
						System.out.println(" -> inserted: " + data);
						return;
					} else {
						tmpNode = tmpNode.getLeft();
					}

				} else if (tmpNode.getData() < data) {
					System.out.print(" [R]" + tmpNode.getData());
					if (tmpNode.getRight() == null) {
						tmpNode.setRight(newNode);
						System.out.println(" -> inserted: " + data);
						return;
					} else {
						tmpNode = tmpNode.getRight();
					}

				}

			}// while
		}

	}
	
	public boolean bstSearch(BstNode root , int data){
		if (root==null){
			return false;
		}
		if (root.getData() ==data){
			return true;
		}else{
			return (bstSearch(root.getLeft(),data)|| bstSearch(root.getRight(),data));
		}
		
	}

	public Integer findHeight() {

		return getNodeHeight(this.root);
	}

	public int getNodeHeight(BstNode root) {
		if (root == null) {
			return -1;
		}
		return Math.max(getNodeHeight(root.getLeft()),
				getNodeHeight(root.getRight())) + 1;
	}

	void printPostorder(BstNode node) {
		if (node == null)
			return;
		
		printPostorder(node.getLeft());
		printPostorder(node.getRight());

		System.out.print(" " + node.getData());
	}

	public void printinOrder(BstNode node) {

		if (node == null)
			return;
		
		printinOrder(node.getLeft());
		System.out.print(" " + node.getData());
		printinOrder(node.getRight());

	}

	public void printPreOrder(BstNode node) {

		if (node == null)
			return;
		
		System.out.print(" " + node.getData());
		printPostorder(node.getLeft());
		
		printPostorder(node.getRight());

	}

	public void printTree() {
		System.out.println("\nPRE ORDER topdown \n");
		printPreOrder(this.root);
		System.out.println("\nIN ORDER \n");
		printinOrder(this.root);	
		System.out.println("\nPOST ORDER --Bottom UP \n");
		printPostorder(this.root);

	}
	
	  public void delete(Integer data) {
		  
	        deleteNode(this.root, data);
	    }
	 
	    private BstNode deleteNode(BstNode root, Integer data) {
	 
	        if(root == null) return root;
	 
	        if(data < root.getData()) {
	            root.setLeft(deleteNode(root.getLeft(), data));
	        } else if(data > root.getData()) {
	            root.setRight(deleteNode(root.getRight(), data));
	        } else {
	            // node with no leaf nodes
	            if(root.getLeft() == null && root.getRight() == null) {
	                System.out.println("deleting "+data);
	                return null;
	            } else if(root.getLeft() == null) {
	                // node with one node (no left node)
	                System.out.println("deleting "+data);
	                return root.getRight();
	            } else if(root.getRight() == null) {
	                // node with one node (no right node)
	                System.out.println("deleting "+data);
	                return root.getLeft();
	            } else {
	                // nodes with two nodes
	                // search for min number in right sub tree
	                Integer minValue = minValue(root.getRight());
	                root.setData(minValue);
	                root.setRight(deleteNode(root.getRight(), minValue));
	                System.out.println("deleting "+data);
	            }
	        }
	 
	        return root;
	    }
	 
	    private Integer minValue(BstNode node) {
	 
	        if(node.getLeft() != null) {
	            return minValue(node.getLeft());
	        }
	        return node.getData();
	    }

	public static void main(String[] args) {
		BTreeImpl01 btree = new BTreeImpl01();
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
		System.out.println("-------------------");
		System.out.println("Height of the tree: " + btree.findHeight());
		System.out.println(" ");
		btree.printTree();
		
		System.out.println("\n data Found  "+btree.bstSearch(btree.root, 27));
		System.out.println("\n data Found  "+btree.bstSearch(btree.root, 50));
	}

}
