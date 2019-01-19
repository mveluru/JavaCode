package com.brite.amazon.datastructures.btree;

import com.brite.amazon.datastructures.linkedlist.LinkedList01;

public class BTreeImpl04 {
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
			System.out.print(" -> " + tempNode.getData());
			while (tempNode != null) {
				if (tempNode.getData() >= data) {
					System.out.print(" [L]" + tempNode.getData());
					if (tempNode.getLeft() != null) {
						tempNode = tempNode.getLeft();
					} else {
						System.out.println(" -> inserted: " + data);
						tempNode.setLeft(newNode);
						break;
					}
				} else if (tempNode.getData() < data) {
					System.out.print(" [R]" + tempNode.getData());
					if (tempNode.getRight() != null) {
						tempNode = tempNode.getRight();
					} else {
						System.out.println(" -> inserted: " + data);
						tempNode.setRight(newNode);
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
		if (root ==null){
			return -1;
			}
		return getHeightOfTree(this.root);
	}
	public int getHeightOfTree(BstNode root){
		if (root ==null){
			return -1;
		}else{
			return Math.max(getHeightOfTree(root.getLeft()), getHeightOfTree(root.getRight()))+1;
		}
	}
	
	public boolean bstSearch(BstNode root,int data){
		if (root ==null){
			return false;
		}else if(root.getData()==data){
			return true;
		}else {
			return(bstSearch(root.getLeft(),data)|| bstSearch(root.getRight(),data)) ;
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
	 private BstNode deleteNode(BstNode root,int data){
		 if (root == null){
			 return root;
		 }
		 if (root.getData()> data){
			 root.setLeft(deleteNode(root.getLeft(), data));
		 }else if (root.getData()<data){
			 root.setRight(deleteNode(root.getRight(), data));
		 }else {
			 if (root.getLeft()==null && root.getRight()==null){
				 System.out.println( " Deleting Data "+data);
				 return null;
			 }else if (root.getLeft()==null){
				 System.out.println( " Deleting Data "+data);
				 return root.getRight();
			 }else if(root.getRight()==null){
				 System.out.println( " Deleting Data "+data);
				 return root.getLeft();
			 }else{
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
	 
	 private Integer minValueR(BstNode node) {
		 
	        if(node.getLeft() != null) {
	            return minValue(node.getRight());
	        }
	        return node.getData();
	    }
	public static void main(String[] args) {
		BTreeImpl04 btree = new BTreeImpl04();
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
		System.out.println("Delete Node");
		btree.delete(23);
		
		btree.printTree();
	}
}
