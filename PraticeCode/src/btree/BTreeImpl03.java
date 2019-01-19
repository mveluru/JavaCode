package com.brite.amazon.datastructures.btree;

public class BTreeImpl03 {
	BstNode root;

	public void insertData(int data) {
		System.out.print("[input: " + data + "]");
		if (root == null) {
			BstNode newNode = new BstNode(data);
			System.out.println(" -> inserted: " + data);
			root = newNode;
			root.setLeft(null);
			root.setRight(null);

		} else {
			BstNode newNode = new BstNode(data);
			BstNode tmpNode = root;
			System.out.print(" ->" + tmpNode.getData());
			while (tmpNode != null) {
				if (tmpNode.getData() >= data) {
					System.out.print(" [L]" + tmpNode.getData());
					if (tmpNode.getLeft() != null) {
						tmpNode = tmpNode.getLeft();
					} else {
						System.out.println(" -> inserted: " + data);
						tmpNode.setLeft(newNode);
						break;

					}
				} else if (tmpNode.getData() < data) {
					System.out.print(" [R]" + tmpNode.getData());
					if (tmpNode.getRight()!=null){
						tmpNode = tmpNode.getRight();
					}else{
						System.out.println(" -> inserted: " + data);
						tmpNode.setRight(newNode);
						break;
					}
				}
			}

		}
	}

	public void preOrderBtree(BstNode root){
		if (root == null){
			return;
		}
		System.out.print(" "+root.getData());
		preOrderBtree(root.getLeft());
		preOrderBtree(root.getRight());
	}
	
	public void inOrderBtree(BstNode root){
		if (root == null){
			return;
		}
		inOrderBtree(root.getLeft());
		System.out.print(" "+root.getData());
		inOrderBtree(root.getRight());
	}
	
	public void postOrderBtree(BstNode root){
		if (root == null){
			return;
		}
		postOrderBtree(root.getLeft());
		postOrderBtree(root.getRight());
		System.out.print(" "+root.getData());
	}
	
	public int findHeightofTree(){
		if (this.root == null){
			return -1;
		}else{
			return getTreeHeight(this.root);
		}
	}
	
	public int getTreeHeight(BstNode root){
		if (root == null) {
			return -1;
		}
		return Math.max(getTreeHeight(root.getLeft()), getTreeHeight(root.getRight()))+1;
	}
	
	public boolean bstSearch(BstNode root,int data){
		if (root== null){
			return false;
		}
		if (root.getData()==data){
			return true;
		}else{
			return (bstSearch(root.getLeft(),data)|| bstSearch(root.getRight(),data));
		}
	}
	
	public void printTree(){
		System.out.println("Pre order" );
		preOrderBtree(this.root);
		System.out.println(" \nIn Order ");
		inOrderBtree(this.root);
		System.out.println(" \nPost Order ");
		postOrderBtree(this.root);
		
	}
	  public void delete(Integer data) {
		  
	        deleteNode(this.root, data);
	    }
	 
	    private BstNode deleteNode(BstNode root, Integer data) {
	 
	        if(root == null) return root;
	 
	        if(root.getData()> data  ) {
	            root.setLeft(deleteNode(root.getLeft(), data));
	        } else if(root.getData() < data  ) {
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
		BTreeImpl03 btree = new BTreeImpl03();
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
		System.out.println("Height of the tree: " + btree.findHeightofTree());
		System.out.println(" ");
		btree.printTree();
		
		System.out.println("\n data Found  "+btree.bstSearch(btree.root, 27));
		System.out.println("\n data Found  "+btree.bstSearch(btree.root, 50));
		System.out.println("delete Node");
		btree.delete(23);
		
		btree.printTree();
	}
}
