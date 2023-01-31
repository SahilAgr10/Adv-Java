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

    public void insertLast(int value){
        if(Tail==null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        Tail.next=node;
        node.prev=Tail;
        Tail = node;
        node.next=null;
        size+=1;
    }
    public Node getPrevious(int index){
        Node node = Head;
        for (int i =0;i<index;i++){
            node=node.next;
        }
        return node;
    }
    public void insert(int value,int index){
        if(index==0){
            insertFirst(value);
            return;
        }
        if(index==size){
            insertLast(value);
            return;
        }
        Node p = getPrevious(index);
        if(p==null){
            System.out.println("Node doesnt exist");
        }
        Node node = new Node(value);
        node.next=p.next;
        p.next=node;
        node.prev=p;
        if(node.next!=null){
            node.next.prev=node;
        }
        size++;
    }
    public void display(){
        Node temp = Head;
        while(temp!=null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void revDisplay(){
        Node temp = Tail;
        while(temp!=null){
            System.out.print(temp.value + "->");
            temp = temp.prev;
        }
        System.out.println("null");
    }


    private class Node {
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }
        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
