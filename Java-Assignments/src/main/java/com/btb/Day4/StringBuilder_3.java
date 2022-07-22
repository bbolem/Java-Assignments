package com.btb.Day4;
public class StringBuilder_3 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Testing StringBuilder methods.");

        System.out.println(stringBuilder);
        System.out.println(stringBuilder.substring(8, 21));
        System.out.println(stringBuilder.lastIndexOf("ing"));

    }
}
