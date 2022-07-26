package com.btb.Day6;
public class RunnableIntEx {
    public static void main(String[] args) {
        EvenThread obj = new EvenThread();
        Thread t1 = new Thread(obj);
        t1.start();

        OddThread obj2 = new OddThread();
        Thread t2 = new Thread(obj2);
        t2.start();
    }
}

class EvenThread implements Runnable{
    public void run(){
        for (int i = 0; i < 10; i+=2){
            System.out.println(i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class OddThread implements Runnable{
    public void run(){

        Thread thread = Thread.currentThread();

        for (int i = 1; i < 10; i+=2){
            System.out.println(i);
            try {
                thread.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}