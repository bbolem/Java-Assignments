package com.btb.Day9;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class CharacterStreamEx {
    public static void main(String[] args) {
        FileReader in = null;
        FileWriter out = null;

        try {
            in = new FileReader("test.txt");
            out = new FileWriter("out.txt");

            int c = 0;
            while ((c = in.read()) != -1){
                out.write(c);
            }


        } catch (IOException e) {
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
