package com.btb.Day7;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedList_ {
    public static void main(String[] args) {
        List<String> carCompany = new LinkedList<>();

        //Add
        carCompany.add("Toyota");
        carCompany.add("BMW");
        carCompany.add("Honda");
        System.out.println(carCompany);

        //Remove
        carCompany.remove(1);
        System.out.println(carCompany);

        //Iteration
        Iterator<String> itr = carCompany.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
