package com.LinkedList;

public class DLLAcess {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(4);
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);
        list.display();
        System.out.println("   size"+"("+ list.size+")");
        list.insertLast(5);
        list.display();
        System.out.println("   size"+"("+ list.size+")");
        list.revDisplay();
        list.insert(10,5);
        list.display();
        System.out.println("   size"+"("+ list.size+")");
        list.revDisplay();
    }
}
