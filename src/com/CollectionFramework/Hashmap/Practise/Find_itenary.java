package com.CollectionFramework.Hashmap.Practise;

import java.util.HashMap;

public class Find_itenary {
    public static void main(String[] args) {
        HashMap<String,String> ticket = new HashMap<>();
        ticket.put("Chennai","Bengaluru");
        ticket.put("Mumbai","Delhi");
        ticket.put("Goa","Chennai");
        ticket.put("Delhi","Goa");

        String start = getStart(ticket);
        System.out.println("you will start from "+start);
        while (ticket.containsKey(start)){
            System.out.print(start + "->");
            start = ticket.get(start);
        }
        System.out.println(start);
    }
    public static String getStart(HashMap<String,String> tick){
        HashMap<String,String> revMap = new HashMap<>();
        for(String key : tick.keySet()){
            revMap.put(tick.get(key),key);
        }
        for(String key : tick.keySet()){
            if(!revMap.containsKey(key)){
                return key;
            }
        }
        return null;
    }
}
