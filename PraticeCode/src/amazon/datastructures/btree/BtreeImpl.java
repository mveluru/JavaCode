package com.brite.amazon.datastructures.btree;

public class BtreeImpl {
	private BstNode root;

	private boolean isEmpty() {
		return (this.root == null);
	}

	private void insert(int data) {
		 System.out.print("[input: "+data+"]");
		if (root == null) {
			System.out.println(" -> inserted: " + data);
			this.root = new BstNode(data);
			return;
		} else {
			BstNode tmpNode = root;
			System.out.print(" ->" + tmpNode.getData());
			while (tmpNode != null) {
				
				if (tmpNode.getData() >= data) {
					System.out.print(" [L]"+tmpNode.getData());
					 if (tmpNode.getLeft()==null){
					    tmpNode.setLeft(new BstNode(data));	
					    System.out.println(" -> inserted: " + data);
					    return;
					 }else{
						 tmpNode = tmpNode.getLeft();
					 }
					
				} else {
					System.out.print(" [R]"+tmpNode.getData());
					 if (tmpNode.getRight()==null){
						    tmpNode.setRight(new BstNode(data));
						    System.out.println(" -> inserted: " + data);
						   return;
						 }else{
							 tmpNode = tmpNode.getRight();
						 }
					
				}
			}

		}

	}
	
	 public Integer findHeight(){
		 
	        return getNodeHeight(this.root);
	    }
	 
	    private Integer getNodeHeight(BstNode node) {
	 
	        if(node == null) {
	            return -1;
	        }
	 
	        return Math.max(getNodeHeight(node.getLeft()), getNodeHeight(node.getRight()))+1;
	    }
	    
	    void printPostorder(BstNode node) 
	    { 
	        if (node == null) 
	            return; 
	  
	        // first recur on left subtree 
	        printPostorder(node.getLeft()); 
	  
	        // then recur on right subtree 
	        printPostorder(node.getRight()); 
	  
	        // now deal with the node 
	        System.out.print(node.getData() + " "); 
	    } 
	    
	    
	    void printinorder(BstNode node) 
	    { 
	        if (node == null) 
	            return; 
	  
	        // first recur on left subtree 
	        printinorder(node.getLeft()); 
	     // now deal with the node 
	        System.out.print(node.getData() + " "); 
	        // then recur on right subtree 
	        printinorder(node.getRight()); 
	  
	        
	       
	    } 
	    
	    void printPreorder(BstNode node) 
	    { 
	        if (node == null) 
	            return; 
	     // now deal with the node 
	        System.out.print(node.getData() + " "); 
	        // first recur on left subtree 
	        printinorder(node.getLeft()); 
	     
	        // then recur on right subtree 
	        printinorder(node.getRight()); 
	  
	        
	       
	    } 
	    
	    
	    public void printPostOrderTree(){
	    	System.out.println("POST ORDER --Bottom UP"); 
	    	System.out.println();
	    	printPostorder(root) ;
	    	System.out.println();
	    	System.out.println("IN ORDER");
	    	System.out.println();
	    	printinorder(root);
	    	System.out.println();
	    	System.out.println("PRE ORDER topdown");
	    	System.out.println();
	    	printPreorder(root);
	    	
	    }
	    
	    
	    
	public static void main(String[] args) {
		BtreeImpl btree = new BtreeImpl();
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
        System.out.println("Height of the tree: "+btree.findHeight());
        System.out.println(" ");
        btree.printPostOrderTree();
	}
}
