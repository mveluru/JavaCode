package com.brite.datastructures;

import java.util.Random;




public class IntLinkedList {
	class Node {
        Node prev;
        Node next;
        int value;
        public Node(int val) {
            this.value = val;
        }
    }
     
    // public and private Fields
    public Node head;
    public Node tail;
    private int size = 0;
     
    // If the list is null, make the new value to be the head
    // Else insert the new value at the end of the linked list
    public void insert(int val) {
        Node newNode = new Node(val);
        if (this.head == null) {
            this.head = newNode;
            this.head.next = this.tail;
        } else {
            if (this.head.next == null) {
                newNode.prev = this.head;
                this.head.next = newNode;
                this.tail = newNode;
            } else {
                this.tail.next = newNode;
                newNode.prev = this.tail;
                this.tail = newNode;
            }
        }
        this.size++;
    }
     
    public int getSize() {
        return this.size;
    }
     
    public void print() {
        Node curNode = this.head;
        while (curNode != null) {
            System.out.println(curNode.value);
            curNode = curNode.next;
        }
    }
 
    public void reversePrint() {
    	
        Node curNode = this.tail;
        while (curNode != null) {
            System.out.println(curNode.value);
            curNode = curNode.prev;
        }
    }
 
    public static void main(String args[]) {
        IntLinkedList ll = new IntLinkedList();
        Random rand = new Random();
        int testSize = 10, maxNum = 100;
         
        for(int i=0; i<testSize; i++) {
            ll.insert(rand.nextInt(maxNum));
        }
        System.out.println("F O R W A R D P R I N T I N G");
        ll.print();
        System.out.println("R E V E R S E P R I N T I N G");
        ll.reversePrint();
        System.out.println("Linked list size: " + ll.getSize());
    }
}
