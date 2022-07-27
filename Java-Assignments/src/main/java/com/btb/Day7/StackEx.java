package com.btb.Day7;
import java.util.Stack;
public class StackEx {
    public static void main(String[] args) {
        Stack<String> animals = new Stack<>();

        animals.push("dog");
        animals.push("cat");
        animals.push("rooster");

        //animals.add("align");

        System.out.println(animals);
    }
}
