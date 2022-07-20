package com.btb.test;
public class PrimeNumbers {
    public static void main(String[] args) {
        int tracker;
        for (int i = 1; i < 100; i++){
            tracker = 0;
            for (int j = i; j >= 1; j--){
                if (i % j == 0){
                    tracker++;
                }
            }
            if (tracker == 2){
                System.out.print(i + " ");
            }
        }
    }
}
