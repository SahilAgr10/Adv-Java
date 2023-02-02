package com.Stack;

import java.util.Stack;

public class CustomStackAccess {
    public static void main(String[] args) {
        CustomStack stack = new CustomStack(5);

        Stack<Integer> stak = new Stack<>();
        System.out.println(stak.push(03) + " is added");
        System.out.println(stak.push(33) + " is added");
        System.out.println(stak.push(32)+ " is added");
        System.out.println(stak.push(34)+ " is added");
        System.out.println(stak.push(35)+ " is added");
        System.out.println(stak.peek() + " is available at Top");
        System.out.println(stak.pop() + " is removed");
        System.out.println(stak.pop()  + " is removed");
        System.out.println(stak.peek() + " is available at Top");


    }
}
