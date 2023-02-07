package com.CollectionFramework.Hashset;
import java.util.*;
public class Hashset_imp {
    public static void main(String[] args) {
        // initialize and create
        HashSet<Integer> set = new HashSet<>();
        set.add(5);
        set.add(9);
        set.add(5);
        set.add(5);
        set.add(8);
        System.out.println(set);

        // to get size
        System.out.println("size is "+set.size());

     //   to iterate elements iterable is used
        Iterator iterator = set.iterator();

        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }
    }
}
