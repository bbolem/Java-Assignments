package com.btb.Day7;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEx {
    public static void main(String[] args) {
        Vector<String> v = new Vector<>();
        v.add("dog");
        v.add("cat");
        v.add("rooster");
        System.out.println("Enhanced For:");
        for (String str : v) {
            System.out.println(str);
        }
        Enumeration<String> enu = v.elements();
        while (enu.hasMoreElements()) {
            System.out.println(enu.nextElement());
        }
    }
}
