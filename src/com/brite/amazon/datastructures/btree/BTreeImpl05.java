package com.brite.amazon.datastructures.btree;

public class BTreeImpl05 {
	BstNode root;
	
	public void insertData(int data){
		BstNode newNode = new BstNode(data);
		
		if(root == null){
			System.out.println("input Data-->" + data);
			root = newNode;
			root.setLeft(null);
			root.setRight(null);
		}else{
			BstNode tempNode = root;
			System.out.print(" ->" + tempNode.getData());
			while (tempNode !=null){
				
				if (tempNode.getData()>= data){
					System.out.print("[L]"+ tempNode.getData());
					
					if (tempNode.getLeft()!=null){
						tempNode = tempNode.getLeft();
					}else{
						tempNode.setLeft(newNode);
						System.out.println("--> Insert Data "+data);
						break;
					}
					
					
				}else if (tempNode.getData()<data){
					
					System.out.print("[R]"+ tempNode.getData());
					if (tempNode.getRight()!=null){
						tempNode = tempNode.getRight();
						
					}else{
						tempNode.setRight(newNode);
						System.out.println("--> Insert Data "+data);
						break;
						
					}
					
					
				}
				
			}
			
			
			
		}
		
	}
	
	public void delete(Integer data) {
		  
		deleteData(this.root, data);
    }
	
	
	public BstNode deleteData(BstNode root ,int data){
		if (root == null){
			System.out.println(" Tree Under flow ");
			return null;
		}
		if (root.getData()> data){
			root.setLeft(deleteData(root.getLeft(),data));		
		}else if( root.getData()<data){
			root.setRight(deleteData(root.getRight(),data));
		}else{
			 // node with no leaf nodes
			if (root.getLeft()==null && root.getRight()==null){
				System.out.println(" Deleted data " + data);
				return null;
			}else if (root.getLeft()==null){
				 System.out.println( " Deleting Data "+data);
				return root.getRight();
				
			}else if (root.getRight()==null){
				 System.out.println( " Deleting Data "+data);
				return root.getLeft();
			}
		}
		return root;
		
	}
    
	public boolean bstSearch(BstNode root,int data){
		if (root == null){
			return false;
		}
		if (root.getData()==data){
			return true;
		}else{
			return (bstSearch(root.getLeft(),data)||bstSearch(root.getRight(),data));
		}
		
	}
	
	public int findHeightofTree(){
		if (root==null){
			return -1;
		}
		return getHeightofTree(root);
		
	}
	
	public int getHeightofTree(BstNode root){
		if (root==null){
			return -1;
		}
		return Math.max(getHeightofTree(root.getLeft()),getHeightofTree(root.getRight()))+1;
		 
	}
	
	public void preOrderBtree(BstNode root){
		if (root ==null){
			return;
		}
		System.out.print(" "+root.getData());
		preOrderBtree(root.getLeft());
		
		preOrderBtree(root.getRight());
		
	}
	
	public void inOrderBtree(BstNode root){
		if (root ==null){
			return;
		}
		inOrderBtree(root.getLeft());
		System.out.print(" "+root.getData());
		inOrderBtree(root.getRight());
		
	}
	
	public void postOrderBtree(BstNode root){
		if (root ==null){
			return;
		}
		postOrderBtree(root.getLeft());
		postOrderBtree(root.getRight());
		System.out.print(" "+root.getData());
		
	}
	
	public void printTree(){
		System.out.println(" pre order printing");
		preOrderBtree(this.root);
		System.out.println(" \n in order printing");
		inOrderBtree(this.root);
		System.out.println("\n prost order printing");
		postOrderBtree(this.root);
		
	}
	
	public static void main(String[] args) {
		BTreeImpl05 btree = new BTreeImpl05();
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
		//btree.delete(23);
		btree.delete(26);
		
		btree.printTree();
	}
}
