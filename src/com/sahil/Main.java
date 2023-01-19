package com.sahil;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int pId;
        String pName ;
        float price;

        Scanner sc = new Scanner(System.in);
        pId = sc.nextInt();
        pName = sc.next();
        price = sc.nextFloat();
        System.out.println("Product ID is :" + pId +"\n Product Name is :"+ pName + "\n Total price :"+ price);

    }


}
