package com.btb.Day4;
public class StringBuffer_2 {
    public static void main(String[] args) {
        StringBuffer strBuf = new StringBuffer("This will be a short sentence so I can test StringBuffer.");

        System.out.println(strBuf.append(" Testing..."));
        System.out.println(strBuf.lastIndexOf("ing"));
        System.out.println(strBuf.length());
        System.out.println(strBuf.delete(57, 68));
        System.out.println(strBuf.reverse());
        System.out.println(strBuf.replace(0,53, "-"));
    }
}
