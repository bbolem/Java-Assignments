package com.btb.Day9;

import java.io.*;

public class BufferedReadWrite_5 {
    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        String line = null;

        try {
            Reader r = new FileReader("C:\\Assignments\\TestFiles\\sample.txt");
            bufferedReader = new BufferedReader(r);

            File out = new File("C:\\Assignments\\TestFiles\\outputBuffered.txt");
            Writer w = new FileWriter(out);
            bufferedWriter = new BufferedWriter(w);

            while ((line = bufferedReader.readLine()) != null){
                bufferedWriter.write(line);
            }

            System.out.println("Buffered Read and Write executed successfully!");

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (bufferedReader != null){
                    bufferedReader.close();
                }
                if (bufferedWriter != null){
                    bufferedWriter.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
