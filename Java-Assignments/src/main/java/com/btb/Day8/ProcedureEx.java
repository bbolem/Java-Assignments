package com.btb.Day8;

import java.sql.*;

public class ProcedureEx {
    public static void main(String[] args) {

        Connection conn = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","");

            //TO AVOID SQL Injection and Validate Arguments
            PreparedStatement inPstmt = conn.prepareStatement("insert into training.employee values (?, ?)");
            inPstmt.setInt(1, Integer.parseInt(args[0]));
            inPstmt.setString(2, args[1]);
            int count = inPstmt.executeUpdate();
            System.out.println(count);

            //Update statement
            inPstmt = conn.prepareStatement("update employee set name = :? where id = :?");
            inPstmt.setString(1, args[2]);
            inPstmt.setInt(2, Integer.parseInt(args[3]));

            PreparedStatement preparedStatement = conn.prepareStatement("select * from employee");

        } catch (SQLException e) {
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
