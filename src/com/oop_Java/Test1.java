package com.oop_Java;

import java.util.Scanner;

public class Test1 {
    private int speed;
    public static void main(String[] args) {
    }
    void run(){
        System.out.println("please decalre  running speed ! ");
        Scanner sc = new Scanner(System.in);
        speed=sc.nextInt();

    }
    void pause(){
        System.out.println("pause");
    }

    void accl(){
        //System.out.println("accelerate");
        System.out.println(" accelerating with a speed of " + speed);
    }
}
