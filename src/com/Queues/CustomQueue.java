package com.Queues;

public class CustomQueue {
    protected int[] data;
    public static final int DEFAULT_SIZE=10;
    int end = 0;

    public CustomQueue(int size) {
        this.data = new int[size];
    }
    public CustomQueue(){
        this(DEFAULT_SIZE);
    }
    public boolean insert(int item) {
        if (isFull()) {
            return false;
        }
        data[end++] = item;
        return true;
    }

    public boolean isFull() {
        return end == data.length; // ptr is at last index
    }
    public boolean isEmpty() {
        return end == -0; // queue is empty
    }
}
