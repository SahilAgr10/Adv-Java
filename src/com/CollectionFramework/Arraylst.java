package com.CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;

public class Arraylst {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList<>();
        // NON-Generic Collection where type is not defined
        arrayList.add(23);
        arrayList.add(45);
        arrayList.add(56);
        arrayList.add("Pune");
        arrayList.add(56);
        System.out.println(arrayList.size());
        System.out.println(arrayList);
        System.out.println(arrayList.indexOf(56));


        ArrayList<Integer> arrayLst = new ArrayList<>();
        //Generic Collection where type is defined
        arrayLst.add(23);
        arrayLst.add(45);
        arrayLst.add(56);
        System.out.println(arrayLst);


    }
}
