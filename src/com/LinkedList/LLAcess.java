package com.LinkedList;

public class LLAcess {
    public static void main(String[] args) {
        SLL list = new SLL();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(0);
        list.insert(134,2);
        list.insertLast(35);
        list.display();
        list.insert(99,5);
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.delete(4));
        list.display();
        System.out.println(list.findNode(0));



    }

}
