package com.btb.Day6;
public class PrintNum_1 {
    public static void main(String[] args) {
        NumThread numThread = new NumThread();
        numThread.start();
    }
}

class NumThread extends Thread {
    public void run() {
        for (int i = 1; i <= 50; i++){
            System.out.print(i + " ");
        }
    }
}