package com.btb.Day5;
public class UnCheckedEx_2 {
    public static void main(String[] args){
        int i[] = new int[2];
        try {
            System.out.println(i[2]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBounds - trying to access index out of array scope");
        }
    }
}
