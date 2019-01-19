package com.brite.amazon.datastructures.graph.depthFirstSearch;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph03{

public int V;
public LinkedList<Integer> adj[];

public Graph03(int v){
 this.V = v ;// verticies
 adj = new LinkedList[v];
 for(int i=0;i<v ;i++){
 adj[i] = new LinkedList<Integer>();
 
 }

}
public void addEdge(int v, int w){
adj[v].add(w);

}

void depthSearchUtil(int v, boolean[] visited){
visited[v] = true;
System.out.print(" "+v);
Iterator<Integer> i = this.adj[v].listIterator();

while(i.hasNext()){

   int n= i.next();
   if (!visited[n]){
    depthSearchUtil(n,visited);
   }
}

}

void DFS(int v){
boolean[] visited = new boolean[this.V];

this.depthSearchUtil(v, visited);


}



public static void main(String[] args){
Graph03 g = new Graph03(4);
g.addEdge(0, 1);
g.addEdge(0, 2);
g.addEdge(1, 2);
g.addEdge(2, 0);
g.addEdge(2, 3);
g.addEdge(3, 3);

  System.out.println("Following is Depth First Traversal "+ 
          "(starting from vertex 2)"); 
  g.DFS(2); 

}// end of the main

}//end of the class