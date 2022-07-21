package com.btb.Day2;

abstract class Human{
    abstract void sleep();
    public void work(){
        System.out.println("Working");
    }
}

class Bob extends Human{
    public void sleep(){
        System.out.println("Sleeping");
    }
}

public class Abstract_5 {
    public static void main(String[] args) {
        Human b = new Bob();
        b.work();
        b.sleep();
    }
}
