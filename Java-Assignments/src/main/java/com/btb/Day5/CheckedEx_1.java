package com.btb.Day5;
public class CheckedEx_1 {
    public static void main(String[] args) {
        try {
            ClassLoader.getSystemClassLoader().loadClass("com.btb.Day5.NoClass");   //ClassNotFoundException
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
