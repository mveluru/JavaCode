package com.brite.amazon.datastructures.graph.breathFristSearch;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {

    Node startNode;
    Node goalNode;

    public BreadthFirstSearch(Node start, Node goalNode){
        this.startNode = start;
        this.goalNode = goalNode;
    }

    public boolean compute(){

        if(this.startNode.equals(goalNode)){
            System.out.println("Goal Node Found!");
            System.out.println(startNode);
        }

        Queue<Node> queue = new LinkedList<>();
        ArrayList<Node> explored = new ArrayList<>();
        queue.add(this.startNode);
        explored.add(startNode);

        while(!queue.isEmpty()){
            Node current = queue.remove();
            if(current.equals(this.goalNode)) {
                System.out.println(explored);
                return true;
            }
            else{
                if(current.getChildren().isEmpty())
                    return false;
                else
                    queue.addAll(current.getChildren());
            }
            explored.add(current);
        }

        return false;

    }
    
    public static void main(String args[]){
        Node station1 = new Node("Westminster", null, null);
        Node station2 = new Node("Waterloo", station1, null);
        Node station3 = new Node("Trafalgar Square", station1, station2);
        Node station4 = new Node("Canary Wharf", station2, station3);
        Node station5 = new Node("London Bridge", station4, station3);
        Node station6 = new Node("Tottenham Court Road", station5, station4);

        BreadthFirstSearch bfs = new BreadthFirstSearch(station6, station1);

        if(bfs.compute())
            System.out.print("Path Found!");
    }

}
