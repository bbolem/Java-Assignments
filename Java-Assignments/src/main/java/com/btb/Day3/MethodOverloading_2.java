package com.btb.Day3;
public class MethodOverloading_2 {
    public double multiply(double a, double b){
        return a*b;
    }
    public double multiply(double a, double b, double c){
        return a*b*c;
    }
    public int multiply(int a, int b){
        return a*b;
    }
    public static void main(String[] args) {
        MethodOverloading_2 test = new MethodOverloading_2();
        double result;
        result = test.multiply(2.5,5.23);
        System.out.println(result);
        result = test.multiply(2.5,5.23, 0);
        System.out.println(result);
        int res = test.multiply(2,5);
        System.out.println(res);
    }
}
