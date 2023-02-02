package com.Stack;

public class CustomStack {
    protected int[] data;
    public static final int DEFAULT_SIZE=10;
    int ptr = -1;

    public CustomStack(int size) {
        this.data = new int[size];
    }
    public CustomStack(){
        this(DEFAULT_SIZE);
    }
    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is Full !!");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }
    public int pop(int item) throws StackException {
        if(isEmpty()) {
            throw new StackException("Stack is Empty");
        }
        int removed = data[ptr];
        ptr--;
        return removed;
    }

    public int peak()throws StackException {
        if(isEmpty()) {
            throw new StackException("Stack is Empty");
        }
        return data[ptr];
    }



    private boolean isFull() {
        return ptr == data.length-1; // ptr is at last index
    }
    private boolean isEmpty() {
        return ptr == -1; // stack is empty
    }
}
