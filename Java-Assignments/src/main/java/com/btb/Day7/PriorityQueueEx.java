package com.btb.Day7;
import java.util.PriorityQueue;
public class PriorityQueueEx {
    public static void main(String[] args) {
        PriorityQueue<String> animals = new PriorityQueue<>();

        animals.add("dog");
        animals.add("cat");
        animals.add("rooster");

//        System.out.println("Enhanced For:");
//        for (String animal : animals) {
//            System.out.println(animal);
//        }
        System.out.println(animals);

        //peek() - view the head without removing it. EX: cat cat
        //poll() - removes and returns the head of the queue. EX: cat dog
        System.out.println(animals.poll());
        System.out.println(animals.poll());

        //System.out.println();
    }
}
