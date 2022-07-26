package com.btb.Day7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<String>();

        animals.add("dog");
        animals.add("cat");
        animals.add("dolphin");
        System.out.println("Enhanced For:");
        for (String animal : animals){
            System.out.println(animal);
        }
        System.out.println(animals.get(1));

        animals.remove(1);

        System.out.println("\nRegular For:");
        for (int i = 0; i < animals.size(); i++){
            System.out.println(animals.get(i));
        }

        Iterator<String> itr = animals.iterator();
        System.out.println("\nWhile:");
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
