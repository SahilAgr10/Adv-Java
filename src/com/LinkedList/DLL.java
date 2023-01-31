package com.LinkedList;

public class DLL {
    Node Head;

    public void insertFirst(int value){
        Node node = new Node(value);
        node.next=Head;
        node.prev=null;
        if(Head!=null){
            Head.prev = node; }
        Head=node;
    }
    public void display(){
        Node temp = Head;
        while(temp!=null){
            System.out.println(temp.value + "->");
            temp = temp.next;
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
