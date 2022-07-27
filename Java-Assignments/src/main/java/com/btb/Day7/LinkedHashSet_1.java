package com.btb.Day7;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSet_1 {
    public static void main(String[] args) {
        Set<String> carCompany = new LinkedHashSet<>();

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
