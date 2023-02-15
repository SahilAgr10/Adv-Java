package com.Sorting.CyclicSort;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3,2,1,4,5};
        // arr = 1,2,3,4,5
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr) {
        for(int i =0;i<arr.length;i++){
            int correctPosition = arr[i] - 1;
            if(arr[i] != arr[correctPosition]){
                int temp = arr[i];
                arr[i] = arr[correctPosition];
                arr[correctPosition] = temp;
            }

        }
    }

}
