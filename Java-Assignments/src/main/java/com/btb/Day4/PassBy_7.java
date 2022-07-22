package com.btb.Day4;
public class PassBy_7 {
    public static void main(String[] args) {
        Footware footware = new Footware("Blue", "Slippers");
        OrderDetails orderDetails = new OrderDetails();

        //Pass by value
        orderDetails.color("Orange");
        System.out.println(footware.getColor());

        //Pass by Reference
        orderDetails.type(footware);
        System.out.println(footware.getColor() + " " + footware.getType());

    }
}

class Footware{
    String color = "";
    String type = "";

    public Footware(String color, String type){
        this.color = color;
        this.type = type;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}

class OrderDetails{
    public void type(Footware f){
        f.setType("Shoe.");
    }
    public void color(String color){
        color = "Red";
    }
}
