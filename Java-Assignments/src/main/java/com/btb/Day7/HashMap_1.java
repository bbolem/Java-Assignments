package com.btb.Day7;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
//import org.apache.commons.lang3.ObjectUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMap_1 {
    public static void main(String[] args) {

        Person p1 = new Person("name1", 123);
        Person p2 = new Person("name2", 456);
        Person p3 = new Person("name3", 789);

        Map<String, Person> people = new HashMap<>();

        //Add - added but not sorted
        people.put("P1-123", p1);
        people.put("P2-456", p2);
        people.put("P3-789", p3);
        //people.put(null, null);
        /*
        for (String k : people.keySet()){
            Person p = people.get(k);
            System.out.println(p);
            if (ObjectUtils.isNotEmpty(p)){
                System.out.println(p.getName());
            }
        }
        */

        for (Map.Entry<String, Person> personEntry : people.entrySet()){
            System.out.println(personEntry.getKey() + " " + personEntry.getValue());
        }

        //Remove
        people.remove("P3-789");
        /*
        for (Person person : people.values()){
            if (ObjectUtils.isNotEmpty(person)){
                System.out.println(person.getName());
            }
        }
        */

        //Iteration
        Iterator<Map.Entry<String, Person>> itr = people.entrySet().iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
class Person{
    String name;
    int ssn;
}
