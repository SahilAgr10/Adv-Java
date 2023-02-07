package com.LinkedList.LLPractice;

import com.LinkedList.SLL;
import org.w3c.dom.Node;

import java.util.LinkedList;

public class Nth_node {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(9);
        list.add(10);
        list.add(15);
        list.add(21);
        list.add(25);
        System.out.println(list);
        int size = list.size();
        System.out.println(getNthElement(list,3,size));
    }
    public static LinkedList<Integer> getNthElement(LinkedList<Integer> list, int nth, int size){

        return list;
    }
}
