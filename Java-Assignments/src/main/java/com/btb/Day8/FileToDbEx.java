package com.btb.Day8;
import java.io.File;
import java.io.FileReader;
import java.sql.*;
public class FileToDbEx {
    public static void main(String[] args) {
        Connection conn = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","");

            PreparedStatement ps = conn.prepareStatement("insert into file_table values(?,?,?)");

            File file = new File("file_name.txt");
            //FileReader fr = new FileReader(file);

            ps.setInt(1, 403);


        } catch (SQLException e){
            e.printStackTrace();
        } finally {
            try {
                if (conn != null){
                    conn.close();
                }
            } catch (SQLException e){
                e.printStackTrace();
            }
        }
    }

}
