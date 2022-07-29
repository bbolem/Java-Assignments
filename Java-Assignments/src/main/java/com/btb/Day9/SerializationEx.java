package com.btb.Day9;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.*;
public class SerializationEx {
    public static void main(String[] args) {
        Employee e = new Employee(101, "Emp101", "password");
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream("path-to-outputFile");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(e);
            System.out.println("Success...");
        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        } finally {
            try {
                fos.close();
                oos.close();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
    }
}

@Setter
@Getter
@AllArgsConstructor
class Employee implements Serializable{
    private static final long serialVersionUID = 1L;
    private int id;
    private String userName;
    private transient String password;  //data won't be serialized
}
