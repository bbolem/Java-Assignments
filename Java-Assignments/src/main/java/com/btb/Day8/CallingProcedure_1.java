package com.btb.Day8;

import java.sql.*;

public class CallingProcedure_1 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","Jhps_232");


            CallableStatement callableStatement = conn.prepareCall("{call stuprodecure(5, 'Stu5')}");
            callableStatement.execute();
            System.out.println("Calling a procedure...");

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
