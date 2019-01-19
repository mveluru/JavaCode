package com.brite.amazon.datastructures.graph.depthFirstSearch;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph01 {

	private int V; // No. of vertices

	// Array of lists for Adjacency List Representation
	private LinkedList<Integer> adj[];

	// v Number of vertices
	public Graph01(int v) {
		this.V = v;
		adj = new LinkedList[v]; 
		for (int i = 0; i < V; i++) {
			this.adj[i] = new LinkedList<>();
		}
	}

	public void addEdge(int v, int E) {
		this.adj[v].add(E);
	}

	// The function to do DFS traversal. It uses recursive DFSUtil()
	void traversal(int v) {
		// Mark all the vertices as not visited(set as
		// false by default in java)
		boolean visited[] = new boolean[this.V];

		// Call the recursive helper function to print DFS traversal
		DFSUtil(v, visited);
	}

	public void DFSUtil(int v, boolean[] visited) {

		visited[v] = true;
		System.out.print(v + " ");
		Iterator<Integer> i = adj[v].listIterator();
		while (i.hasNext()) {
			int vertex = i.next();
			if (!visited[vertex])
				DFSUtil(vertex, visited);
		}
	}
	
	 // The function to do DFS traversal. It uses recursive DFSUtil() 
    void DFS(int v) 
    { 
        // Mark all the vertices as not visited(set as 
        // false by default in java) 
        boolean visited[] = new boolean[V]; 
  
        // Call the recursive helper function to print DFS traversal 
        DFSUtil(v, visited); 
    } 

	public static void main(String args[]) {
		Graph01 g = new Graph01(4);
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
