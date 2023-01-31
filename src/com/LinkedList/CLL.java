package com.LinkedList;

public class CLL {
    private Node Head;
    private Node Tail;

    public CLL() {
        this.Head = null;
        this.Tail = null;
    }
    public void insert(int value){
        Node node = new Node(value);
        if(Head==null){
            Head=node;
            Tail=node;
            return;
        }
        Tail.next=node;
        node.next=Head;
        Tail=node;


    }

    private class Node {
        private int value;
        private Node next;
        public Node(int value) {
            this.value = value;
        }
    }
}
