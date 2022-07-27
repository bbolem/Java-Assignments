package com.btb.Day7;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMap_1 {
    public static void main(String[] args) {

        Person p1 = new Person("name1", 123);
        Person p2 = new Person("name2", 456);
        Person p3 = new Person("name3", 789);

        Map<String, Person> people = new TreeMap<>();

        //Add - no null values accepted
        people.put("P3-789", p3);
        people.put("P1-123", p1);
        people.put("P2-456", p2);


        for (Map.Entry<String, Person> personEntry : people.entrySet()){
            //Prints in sorted format
            System.out.println(personEntry.getKey() + " " + personEntry.getValue());
        }

        //Remove
        people.remove("P1-123");

        //Iteration
        Iterator<Map.Entry<String, Person>> itr = people.entrySet().iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
