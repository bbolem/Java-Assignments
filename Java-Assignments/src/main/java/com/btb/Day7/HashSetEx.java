package com.btb.Day7;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class HashSetEx {
    public static void main(String[] args) {
        Set<String> animals = new HashSet<>();

        animals.add("add");
        animals.add("cat");
        animals.add("dolphin");

        System.out.println("Enhanced For-loop:");
        for (String animal : animals){
            System.out.println(animal);
        }
        //System.out.println(animals.get(1));

        animals.remove(1);

        System.out.println("\nRegular For-loop:");
        for (int i = 0; i < animals.size(); i++){
            //System.out.println(animals.get(i));
        }

        Iterator<String> itr = animals.iterator();
        System.out.println("\nWhile-loop:");
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
