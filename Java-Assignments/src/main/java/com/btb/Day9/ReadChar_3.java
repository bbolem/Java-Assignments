package com.btb.Day9;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadChar_3 {
    public static void main(String[] args) {
        FileReader in = null;
        int temp = 0;

        try {
            in = new FileReader("C:\\Assignments\\TestFiles\\sample.txt");

            temp = in.read();

            System.out.println("File read : tempVal = " + temp);

        }  catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (in != null){
                    in.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
