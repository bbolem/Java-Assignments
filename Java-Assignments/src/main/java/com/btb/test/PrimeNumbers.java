package com.btb.test;

/**
 *
 * Need to understand the proper logic!
 *
 */

public class PrimeNumbers {
    public static void main(String[] args) {
//        int tracker;
//        for (int i = 1; i < 100; i++){
//            tracker = 0;
//            for (int j = i; j >= 1; j--){
//                if (i % j == 0){
//                    tracker++;
//                }
//            }
//            if (tracker == 2){
//                System.out.print(i + " ");
//            }
//        }
        //Wilson Theorem
        int i = 2;
        int j = 2;
        do {
            if (i == 2){
                System.out.print(i + " ");
            }
            else if((i-1) != ((i-1) % i)){
                System.out.print(i + " ");
            }
            i++;
        }while (i <= 100);
    }
}
