package com.btb.Day2;
public class BreakStatement {
    public static void main(String[] args) {
        for (int i = 50; i <= 100; i++){
            if (i == 75){
                break;
            }
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }
    }
}