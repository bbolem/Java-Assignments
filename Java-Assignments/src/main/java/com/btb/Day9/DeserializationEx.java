package com.btb.Day9;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
public class DeserializationEx {
    public static void main(String[] args) {
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            fis = new FileInputStream("path-to-file");
            ois = new ObjectInputStream(fis);
            Employee e = (Employee) ois.readObject();
            System.out.println(e.getId() + " " + e.getUserName() + " " + e.getPassword());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fis.close();
                ois.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
