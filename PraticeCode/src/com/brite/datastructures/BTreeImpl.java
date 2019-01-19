package com.brite.datastructures;

public class BTreeImpl {
	
	private Btree root;
	
	public Btree getRoot() {
		return root;
	}

	public void setRoot(Btree root) {
		this.root = root;
	}

	private void insert(int data) {
		
		if (root == null) {
			this.root = new Btree();
			this.root.setData(data);
			System.out.println(" -> inserted: " + data);
			return;
		}
		insertBnode(root, data);
		System.out.print(" -> inserted: "+data);
        System.out.println();
	}

  private Btree insertBnode(Btree bnode, int data){
	  Btree tmpNode=null;
	  if (bnode.getData()>= data){
		  System.out.print(" [L]");
		  if (bnode.getLeft()== null){
			  Btree newNode= new Btree();
			  newNode.setData(data);
			  bnode.setLeft(newNode);
			  return bnode.getLeft();
		  }else{
			  tmpNode=bnode.getLeft();
		  }
		 
	  }else if(bnode.getData()< data){
		  System.out.print(" [R]");
		  if (bnode.getRight()== null){
			  Btree newNode= new Btree();
			  newNode.setData(data);
			  bnode.setRight(newNode);
			  return bnode.getRight();
		  }else{
			  tmpNode=bnode.getRight();
		  }
	  }
	 
		return  insertBnode(tmpNode,data);
	 
  }
	
  private Btree SearchForNode(int data){
	 Btree tempNode = null;
	  if (getRoot() == null){
		  return null;
	  }else{
		  Btree rootNode = getRoot();
		  if (data <=rootNode.getData()){
			  Btree leftNode = rootNode.getLeft();
			 while (leftNode != null){
				 if (leftNode.getData()!= data){
					 leftNode = leftNode.getLeft();
					
				 }else if(leftNode.getData()== data) {
					 
					 tempNode = leftNode;
				 }
			 }
		  }else if (data > rootNode.getData()){
			  Btree rightNode = rootNode.getRight();
				 while (rightNode != null){
					 if (rightNode.getData()!= data){
						 rightNode = rightNode.getLeft();
					 }else if(rightNode.getData()== data) {
						 
						 tempNode= rightNode;
					 }
				 }
		  }
	  }
	  
	return tempNode;
	  
  }
	public static void main(String[] args) {
		
		BTreeImpl bst = new BTreeImpl();
	        bst.insert(10);
	        bst.insert(20);
	        bst.insert(21);
	        bst.insert(8);
	        bst.insert(6);
	        bst.insert(16);
	        bst.insert(23);
	        Btree btree= bst.SearchForNode(23);
	       System.out.println("Data Found " + btree.getData());;
	}

}
