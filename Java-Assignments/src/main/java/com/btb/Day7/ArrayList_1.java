package com.btb.Day7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList_1 {
    public static void main(String[] args) {
        List<String> carCompany = new ArrayList<>();

        //Add
        carCompany.add("Toyota");
        carCompany.add("BMW");
        carCompany.add("Subaru");
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
