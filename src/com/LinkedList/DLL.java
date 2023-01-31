package com.LinkedList;

public class DLL {
    Node Head;
    Node Tail;

    int size;

    public DLL() {
        this.size = 0;
    }

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next=Head;
        node.prev=null;
        if(Head!=null){
            Head.prev = node; }
        Head=node;
        if(Tail==null){
            Tail=Head;
        }
        size+=1;
    }
    public void display(){
        Node temp = Head;
        Node last = null;
        while(temp!=null){
            System.out.print(temp.value + "->");
            last=temp;
            temp = temp.next;
        }
        System.out.println("null");
        System.out.println("Reverse Order Nodes :");
        while(last!=null){
            System.out.print(last.value + "->");
            last = last.prev;
        }
    }

    private class Node {
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }
        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
