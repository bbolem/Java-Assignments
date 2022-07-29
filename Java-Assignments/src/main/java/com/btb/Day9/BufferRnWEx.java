package com.btb.Day9;

import java.io.*;

public class BufferRnWEx {
    public static void main(String[] args) {
        BufferedReader br = null;
        BufferedWriter bw = null;

        try {
            Reader reader = new FileReader("path-to-file");
            br = new BufferedReader(reader);
            String line = null;

            File out = new File("path-to-output-file");
            Writer writer = new FileWriter(out);
            bw = new BufferedWriter(writer);

            while ((line = br.readLine()) != null){
                bw.write(line);
                bw.flush();
            }
            System.out.println("Success...");

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try{
                br.close();
                bw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
