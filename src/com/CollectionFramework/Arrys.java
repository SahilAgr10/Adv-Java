package com.CollectionFramework;

import java.util.Arrays;
import java.util.Scanner;

public class Arrys {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,6,7};
        int[] arr1 = new int[2];
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i<arr1.length;i++){
            arr1[i]= sc.nextInt();
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(arr1);
    }
}
