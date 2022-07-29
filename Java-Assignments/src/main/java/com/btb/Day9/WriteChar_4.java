package com.btb.Day9;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteChar_4 {
    public static void main(String[] args) {
        FileReader in = null;
        FileWriter out = null;
        int temp = 0;

        try {
            in = new FileReader("C:\\Assignments\\TestFiles\\sample.txt");
            out = new FileWriter("C:\\Assignments\\TestFiles\\outputChar.txt");

            while ((temp = in.read()) != -1){
                out.write(temp);
            }

            System.out.println("Output file created!");

        }  catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (in != null){
                    in.close();
                }
                if (out != null){
                    out.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
