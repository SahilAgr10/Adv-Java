package com.Abstraction;

public abstract class Parent {
    public Parent(){
        System.out.println("Abstract Parent constructor");
    }
    abstract void demo();
    public void display(){
        System.out.println("Concreate method");
    }
}
