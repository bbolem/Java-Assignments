package com.btb.Day6;
public class ThreadsEx {
    public static void main(String[] args) {

        Thread thread = Thread.currentThread();
        System.out.println(thread.getName());
        System.out.println(thread.getPriority());
        System.out.println(thread.getState());
        System.out.println(thread.getId());

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        EvenNumThread even = new EvenNumThread();
        even.setName("EvenNumPrintThread");
        even.setPriority(3);    //Set priority based on the importance/urgency of the thread
        even.start();   //starts executing run method

        //OddNumThread odd = new OddNumThread();
        //odd.start();    //starts executing run method

    }
}

class EvenNumThread extends Thread {
    public void run(){

        Thread thread = Thread.currentThread();
        System.out.println(thread.getName());
        System.out.println(thread.getPriority());
        System.out.println(thread.getState());
        System.out.println(thread.getId());

        for (int i = 0; i < 10; i+=2){
            System.out.println(i);
        }
    }
}

class OddNumThread extends Thread {
    public void run(){
        for (int j = 1; j< 10; j+=2){
            System.out.println(j);
        }
    }
}