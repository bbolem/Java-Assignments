package com.btb.Day7;
import java.util.Iterator;
import java.util.Set;
public class HashSet {
    public static void main(String[] args) {
        Set<String> carCompany = new java.util.HashSet<>();

        //Add
        carCompany.add("Toyota");
        carCompany.add("Mercedes Benz");
        carCompany.add("Acura");
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
