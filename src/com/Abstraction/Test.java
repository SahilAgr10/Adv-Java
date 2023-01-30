package com.Abstraction;

import com.Abstraction.Interface.Child;
import com.Abstraction.Interface.I1;
import com.Abstraction.Interface.I2;

public class Test {
    public static void main(String[] args) {
        Parent pr = new child();
        pr.display();
        pr.demo();

        Child child = new Child();
        I1.demo1();
        I1 i = new Child();
        I2 i2 = new Child();
        i.demo();
        i2.demo2();


    }
}
