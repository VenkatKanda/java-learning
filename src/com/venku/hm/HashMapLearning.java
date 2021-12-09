package com.venku.hm;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class HashMapLearning {

    public static void main(String[] args) {
        //callHashMap();
        callSet();
    }

    private static void callSet() {

        System.out.println("set data");

     Set<String>  setData = new TreeSet<>();
     setData.add("sathish");
     setData.add("venkatesh");
     setData.add("sathish");
     setData.forEach(data-> System.out.println(data));
    }

    private static void callHashMap() {
        System.out.println("map data");
        Map<String,String> mapData = new HashMap<>();
        mapData.put("sathish","societe general");
        mapData.put("sathish","ge healthcare");
        mapData.entrySet().forEach(e-> System.out.println(e.getKey() + "---" + e.getValue()));
    }
}
