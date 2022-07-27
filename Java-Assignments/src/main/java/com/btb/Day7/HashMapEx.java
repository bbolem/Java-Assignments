package com.btb.Day7;
import java.util.Map;
public class HashMapEx {
    public static void main(String[] args) {
        Map<String, String> map1 = new java.util.HashMap<>();

        map1.put("key1", "name1");
        map1.put("key2", "name2");
        map1.put("key3", "name3");
        map1.put("key1", "name11"); //will override the value with the same key

        System.out.println(map1.get("key1"));
        System.out.println(map1.get("key2"));

        //Iterate through all elements
        for (String s : map1.keySet()){
            //System.out.println(s + " " + map1.get(s));
        }

        for (Map.Entry<String, String> entry : map1.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
