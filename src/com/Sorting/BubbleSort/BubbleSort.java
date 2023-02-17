package com.Sorting.BubbleSort;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {7,6,5,4,2,8,1,4,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr) {
        for(int i = 0 ;i< arr.length;i++){
            boolean isChecked = false;
            for(int j = 0;j <arr.length - i-1;j++){
                if(arr[j]  >arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isChecked=true;
                }
            }
            if(!isChecked){
                break;
            }
        }
    }
}
