package com.btb.Day6;
public class PrintEvenOdd_2 {
    public static void main(String[] args) {
        Even obj = new Even();
        Thread t1 = new Thread(obj);
        t1.start();

        Odd odd = new Odd();
        odd.start();
    }
}

class Even implements Runnable {
    public void run(){
        System.out.println("Even Numbers (0-10):");
        for (int i = 0; i <= 10; i+=2){
            System.out.print(i + " ");
        }
    }
}

class Odd extends Thread {
    public void run(){
        System.out.println("\nOdd Numbers (0-10):");
        for (int j = 1; j <= 10; j+=2){
            System.out.print(j + " ");
        }
    }
}