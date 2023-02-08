package com.CollectionFramework.Hashmap.Practise;

import java.util.HashSet;

public class IntersectionElement {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5,1,2,1,2,3,12,3};
        int arr2[] = {1,2,3,4,12};
        commonElements(arr1,arr2);
    }

    private static void commonElements(int[] arr1, int[] arr2) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        int count = 0;
        for(int j = 0;j<arr2.length;j++){
            if(set.contains(arr2[j])){
                count++;
                System.out.print(arr2[j]+" ");
                set.remove(arr2[j]);
            }
        }
    }
}
