package com.brite.amazon.datastructures.graph;

import java.util.Set;

public class GraphNode {
	  private Set<Node> nodes;
	    private Set<Edge> edges;

	    private class Node {
	        private int data;
	        public Node(int data){
	        	this.data=data;
	        }
	    }

	    private class Edge {
	        private Node to;
	        private Node from;
	        private Number cost;
	    }

}
