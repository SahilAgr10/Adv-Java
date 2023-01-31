package com.LinkedList;

public class CLL {
    private Node Head;
    private Node Tail;

    public CLL() {
        this.Head = null;
        this.Tail = null;
    }

    private class Node {
        private int value;
        private Node next;
        public Node(int value) {
            this.value = value;
        }
    }
}
