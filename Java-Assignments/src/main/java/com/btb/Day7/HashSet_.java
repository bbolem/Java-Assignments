package com.btb.Day7;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/**
 *
 * HashSet sorts the elements.
 * To remove an element, you have to put in the actual element value.
 *
 */

public class HashSet_ {
    public static void main(String[] args) {
        Set<String> carCompany = new HashSet<>();

        //Add
        carCompany.add("Toyota");
        carCompany.add("Mercedes Benz");
        carCompany.add("Acura");
        System.out.println(carCompany);

        //Remove
        carCompany.remove("Toyota");
        System.out.println(carCompany);

        //Iteration
        Iterator<String> itr = carCompany.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
