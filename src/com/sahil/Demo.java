package com.sahil;

public class Demo {
    static int a = 5;
    static int b = 8;
     public static void getData(){
        System.out.println(Add(a,b));
        System.out.println(subtract(a,b));

    }

    static int Add(int a ,int b){
        return a+b;
    }
    static int subtract(int a ,int b){
        return a-b;
    }
}
