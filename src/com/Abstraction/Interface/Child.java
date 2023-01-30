package com.Abstraction.Interface;

public class Child implements I1,I2{
    @Override
    public void demo() {
        System.out.println("Demo Call");
    }

    @Override
    public void demo2() {
        System.out.println("demo2");
    }
}
