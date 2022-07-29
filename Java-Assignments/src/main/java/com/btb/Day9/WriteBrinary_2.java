package com.btb.Day9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteBrinary_2 {
    public static void main(String[] args) {
        FileInputStream source = null;
        FileOutputStream target = null;
        int temp = 0;

        try {
            try {
                source = new FileInputStream("C:\\Assignments\\TestFiles\\test.png");
                target = new FileOutputStream("C:\\Assignments\\TestFiles\\binaryOut.png");

                while ((temp = source.read()) != -1){
                    target.write((byte) temp);
                }

                System.out.println("Output file created!");
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } finally {
            try {
                if (source != null){
                    source.close();
                }
                if (target != null){
                    target.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
