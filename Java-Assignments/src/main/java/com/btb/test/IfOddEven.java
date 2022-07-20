package com.btb.test;
public class IfOddEven {
    public static void main(String[] args) {
        int i = Integer.parseInt(args[0]);
        if (i % 2 == 0){
            System.out.println("Number is Even!");
        }
        else {
            System.out.println("Number is Odd!");
        }
    }
}
