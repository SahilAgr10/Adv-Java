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
    public void display() {
        Node node = Head;
        if (Head != null) {
            do {
                System.out.print(node.value + " -> ");
                if (node.next != null) {
                    node = node.next;
                }
            } while (node != Head);
        }
        System.out.println("HEAD");
    }

    private class Node {
        private int value;
        private Node next;
        public Node(int value) {
            this.value = value;
        }
    }
}
