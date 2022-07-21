package com.btb.Day2;

class Person{
    final int ssn;
    Person(int ssn) {
        this.ssn = ssn;
    }
}

final class Charles extends Person{
    final String name = "Charles";
    Charles(int ssn) {
        super(ssn);
    }
    final void getDetails(){
        System.out.println("Name: " + name + "\nSSN: " + ssn);
    }
}

public class Final_8 {
    public static void main(String[] args) {
        Charles charles = new Charles(123456789);
        charles.getDetails();
    }
}
