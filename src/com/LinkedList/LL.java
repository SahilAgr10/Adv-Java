package com.LinkedList;

import org.w3c.dom.Node;

public class LL {

    private Node Head;
    private Node Tail;
    private int size;

    public LL() {
        this.size = 0;
    }
    public void insertFirst(int value){
        Node node = new Node(value);
        node.next=Head;
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
        size+=1;
    }
    public void insert(int value,int index){
        if(index==0){
            insertFirst(value);
            return;
        }
//        if(index==size){
//            insertLast(value);
//            return;
//        }
        Node temp = Head;
        for (int i = 0 ;i<index-1;i++){
            temp=temp.next;
        }
        Node node = new Node(value,temp.next);
        temp.next=node;
        size++;
    }

    public void display(){
        Node temp = Head;
        while (temp!=null){
            System.out.print(temp.value + " -> ");
            temp= temp.next;
        }
        System.out.println("size is " + size);
    }

   public class Node{
        private int value;
        private Node next;

       public Node(int value) {
           this.value = value;
       }

       public Node(int value, Node next) {
           this.value = value;
           this.next = next;
       }
   }
}
