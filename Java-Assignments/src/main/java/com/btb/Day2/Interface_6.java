package com.btb.Day2;

interface Devices{
    void devType();
}

class Phone implements Devices{
    public void devType(){
        System.out.println("This device is a phone!");
    }
}

class Laptop implements Devices{
    public void devType(){
        System.out.println("This device is a laptop!");
    }
}

public class Interface_6 {
    public static void main(String[] args) {
        Devices d1 = new Laptop();
        Devices d2 = new Phone();
        d1.devType();
        d2.devType();
    }
}
