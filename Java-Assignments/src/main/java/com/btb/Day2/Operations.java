package com.btb.Day2;
public class Operations {
    public static void main(String[] args) {
        int i = 1, j = 5;
        System.out.print("i = " + i);
        System.out.println(" j = " + j);

        System.out.println("\nArithmetic Operation");
        System.out.println("i + j = " + (i+j));
        System.out.println("i * j = " + (i*j));
        System.out.println("i % j = " + (i%j));

        System.out.println("\nUnary Operation");
        System.out.println("--i = " + --i);
        System.out.println("j++ = " + j++);
        System.out.println("++j = " + ++j);

        System.out.println("\nRelational Operation");
        System.out.println("i == j = " + (i == j));
        System.out.println("i < j = " + (i < j));
        System.out.println("i >= j = " + (i >= j));

        boolean x = true, y = false;
        System.out.println("\nLogical Operation");
        System.out.println("x && y = " + (x && y));
        System.out.println("x || y = " + (x || y));
        System.out.println("!(a && b) = " + !(x && y));
    }
}
