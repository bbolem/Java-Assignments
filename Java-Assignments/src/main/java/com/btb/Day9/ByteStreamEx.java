package com.btb.Day9;

import java.io.*;

public class ByteStreamEx {
    public static void main(String[] args) {
        FileInputStream sourceStream = null;
        FileOutputStream targetStream = null;
        int temp = 0;

        try {
            try {
                sourceStream = new FileInputStream("~/Users/bhuvanbolem/Desktop/HCL/TestFiles/test.png\n");
                //StringBufferInputStream bin = new StringBufferInputStream();
                targetStream = new FileOutputStream("~/Desktop/HCL/TestFiles/out_binary.png\n");

                while ((temp = sourceStream.read()) != -1){
                    targetStream.write((byte)temp);
                }
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }finally {
            try {
                if (sourceStream != null){
                    sourceStream.close();
                }
                if (targetStream != null){
                    targetStream.close();;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
