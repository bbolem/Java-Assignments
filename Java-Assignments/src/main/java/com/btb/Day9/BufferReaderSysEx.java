package com.btb.Day9;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
public class BufferReaderSysEx {
    public static void main(String[] args) {
        BufferedReader br = null;
        FileOutputStream fo = null;

        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter your name: ");
            String name = br.readLine();
            System.out.println("You entered " + name);

            fo = new FileOutputStream("output.txt");
            if (!name.isEmpty()){
                fo.write(name.getBytes());
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
