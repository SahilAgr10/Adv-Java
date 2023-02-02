package com.Stack;

public class CustomStack {
    protected int[] data;
    public static final int DEFAULT_SIZE=10;

    public CustomStack(int size) {
        this.data = new int[size];
    }
    public CustomStack(){
        this(DEFAULT_SIZE);
    }
}
