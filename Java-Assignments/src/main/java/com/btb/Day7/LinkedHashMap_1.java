package com.btb.Day7;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap_1 {
    public static void main(String[] args) {

        Person p1 = new Person("name1", 123);
        Person p2 = new Person("name2", 456);

        Map<String, Person> people = new LinkedHashMap<>();

        //Add
        people.put("P1-123", p1);
        people.put("P2-456", p2);
        people.put(null, null);

        for (Map.Entry<String, Person> personEntry : people.entrySet()){
            //Printed in LIFO order
            System.out.println(personEntry.getKey() + " " + personEntry.getValue());
        }

        //Remove
        people.remove(null);

        //Iteration
        Iterator<Map.Entry<String, Person>> itr = people.entrySet().iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
