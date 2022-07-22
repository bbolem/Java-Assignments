package com.btb.Day2;
public class ContinueStatement {
    public static void main(String[] args) {
        for (int i = 1; i <= 25; i++){
            if (i % 2 == 0){
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
