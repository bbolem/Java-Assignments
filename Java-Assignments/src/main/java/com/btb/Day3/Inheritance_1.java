package com.btb.Day3;

class Vehicle{
    private int speed;

    public Vehicle(int speed){
        this.speed = speed;
    }
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
}

class Car extends Vehicle{

    private String carMake;
    public Car(int speed, String carMake) {
        super(speed);
        this.carMake = carMake;
    }
    public String getCarMake() {
        return carMake;
    }
    public void setCarMake(String carMake) {
        this.carMake = carMake;
    }
}

public class Inheritance_1 {
    public static void main(String[] args) {
        Car c = new Car(45, "Toyota");
        System.out.println("Speed: " + c.getSpeed() + " Make: " + c.getCarMake());
    }
}
