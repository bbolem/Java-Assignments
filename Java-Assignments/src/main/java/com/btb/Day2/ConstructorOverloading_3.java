package com.btb.Day2;
public class ConstructorOverloading_3 {

    private int id;
    private String name;

    public ConstructorOverloading_3(){
        id = 2;
        name = "Bob";
    }

    public ConstructorOverloading_3(int id, String name){
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        ConstructorOverloading_3 test = new ConstructorOverloading_3(1, "Alice");
        System.out.println(test.id + " " + test.name);
        ConstructorOverloading_3 test2 = new ConstructorOverloading_3();
        System.out.println(test2.id + " " + test2.name);
    }
}
