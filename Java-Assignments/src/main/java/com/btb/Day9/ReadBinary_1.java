package com.btb.Day9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadBinary_1 {
    public static void main(String[] args) {
        FileInputStream source = null;
        int temp = 0;

        try {
            try {
                source = new FileInputStream("C:\\Assignments\\TestFiles\\test.png");

                temp = source.read();

                System.out.println("File Read : temp = " + temp);

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
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
