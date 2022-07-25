package com.btb.Day5;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class CheckedExceptionEx {
    public static void main(String[] args) {
        File file = new File("/Users/bhuvanbolem/Desktop/HCL/Java-Assignments/Java-Assignments/src/main/java/com/btb/Day5/test.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));   //Compiler found FileNotFoundException.
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
