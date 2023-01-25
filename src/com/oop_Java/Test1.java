package com.oop_Java;

import java.util.Scanner;

public class Test1 {
    private int speed;
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
    }
    void start(){
        System.out.println("please add 'start' to start the Car !" );
        String start = sc.next();
        if(start.isEmpty() || !start.equals("start")){
            System.out.println("Car not Started ! Program Terminated");
        }
        else{
                System.out.println("Your Car has Started ! \nActivating Blutooth Assistance ...\nDone ! Your System has been Activated");
            }
        }
    void run(){
        System.out.println("\n\n Car is on Auto Speed Driving At 20Km/hr. \n please Declare running speed ! ");
        speed=sc.nextInt();

    }
    void accl(){
        //System.out.println("accelerate");
        System.out.println(" Your Speed has been set !\naccelerating with a speed of " + speed);
    }
    void pause(){
        System.out.println("pause");
    }


}
