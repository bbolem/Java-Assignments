package com.btb.Day7;

import java.util.Iterator;
import java.util.Stack;

public class Stack_1 {
    public static void main(String[] args) {
        Stack<String> carCompany = new Stack<>();

        //Add
        carCompany.push("Toyota");
        carCompany.push("BMW");
        carCompany.push("Subaru");
        carCompany.add("Acura");    //add work here as well
        System.out.println(carCompany);

        //Remove
        //carCompany.remove(1); //
        carCompany.pop();   //Removes element on top of stack
        System.out.println(carCompany);

        //Iteration
        Iterator<String> itr = carCompany.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
