package com.brite.amazon.datastructures.graph.depthFirstSearch;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph02 {
	private int V;
	private LinkedList<Integer> adj[];
	
	public Graph02(int v){
		this.V = v;
		adj = new LinkedList[v]; 
		for (int i=0;i<v;i++){
			adj[i]= new LinkedList<Integer>();
		}
	}

	public void addEdge(int v, int e){
		this.adj[v].add(e);
	}
	
	void DFSutils(int v, boolean[] visited){
		visited[v] =true;
		System.out.println(" "+v);
		Iterator<Integer> i = adj[v].listIterator();
		while (i.hasNext()){
			 int vertex = i.next();
			 if (!visited[vertex]){
				 DFSutils(vertex,visited);
			 }
		}
	}
	
	 void DFS(int v){
		 boolean[] visited = new boolean[this.V];
		 DFSutils(v,visited);
	 }
	 
	 public static void main(String args[]) {
		 Graph02 g = new Graph02(4);
			g.addEdge(0, 1);
			g.addEdge(0, 2);
			g.addEdge(1, 2);
			g.addEdge(2, 0);
			g.addEdge(2, 3);
			g.addEdge(3, 3);
			
			  System.out.println("Following is Depth First Traversal "+ 
	                  "(starting from vertex 2)"); 
			  g.DFS(2); 
		}
}
