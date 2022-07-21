package com.btb.Day2;
class Parent{
    public void message(){
        System.out.println("Parent");
    }
}

class Child1 extends Parent{
    public void message(){
        System.out.println("Child1");
    }
}

class Child2 extends Parent{
    public void message(){
        System.out.println("Child2");
    }
}

public class MethodOverriding_4 {
    public static void main(String[] args) {
        Parent p = new Parent();
        Parent c1 = new Child1();
        Parent c2 = new Child2();
        p.message();
        c1.message();
        c2.message();
    }
}
