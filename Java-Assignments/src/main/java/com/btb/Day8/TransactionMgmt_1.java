package com.btb.Day8;
import java.sql.*;
public class TransactionMgmt_1 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","Jhps_232");

            stmt = conn.createStatement();

            //To set commit to false, cause the default is true
            conn.setAutoCommit(false);

            stmt.executeUpdate("insert into training.student values (5, 'Stu5')");
            System.out.println("Employee inserted successfully...");

            //If everything is executed successfully then commit
            conn.commit();

        } catch (SQLException e) {
            try {
                //Rollback if data is unable to commit
                conn.rollback();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
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
