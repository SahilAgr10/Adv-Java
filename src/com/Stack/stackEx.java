package com.Stack;

import java.util.Stack;

public class stackEx {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        System.out.println(stack.push(3));
        System.out.println(stack.push(33));
        System.out.println(stack.push(32));
        System.out.println(stack.push(34));
        System.out.println(stack.push(35));
        System.out.println();
        System.out.println(stack.pop() + " is removed");
        System.out.println(stack.pop()  + " is removed\n");
        System.out.println(stack.peek() + " is available at Top");

    }
}
