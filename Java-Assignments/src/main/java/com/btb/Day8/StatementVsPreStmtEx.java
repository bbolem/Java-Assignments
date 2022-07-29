package com.btb.Day8;

import java.sql.*;

public class StatementVsPreStmtEx {
    public static void main(String[] args) {
        Connection conn = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","");
            Statement stmt = conn.createStatement();
            stmt.addBatch("insert into employee values (101, 'Emp101')");
            stmt.addBatch("insert into employee values (102, 'Emp102')");
            stmt.addBatch("insert into employee values (103, 'Emp103')");
            stmt.executeBatch();


            PreparedStatement inPstmt = conn.prepareStatement("insert into training.employee values (?, ?)");

            inPstmt.setInt(1,201);
            inPstmt.setString(2, "Emp201");
            inPstmt.executeBatch();

            inPstmt.setInt(1,202);
            inPstmt.setString(2, "Emp202");
            inPstmt.executeBatch();

            inPstmt.setInt(1,203);
            inPstmt.setString(2, "Emp203");
            inPstmt.executeBatch();

            System.out.println("Success...");

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
