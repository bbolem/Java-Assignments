package com.btb.Day7;

import java.util.Iterator;
import java.util.Vector;

public class Vector_1 {
    public static void main(String[] args) {
        Vector<String> carCompany = new Vector<>();

        //Add
        carCompany.add("Honda");
        carCompany.add("BMW");
        carCompany.add("Lexus");
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
