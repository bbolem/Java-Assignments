package com.btb.Day8;

import java.sql.*;

public class PreparedStmtEx {
    public static void main(String[] args) {
        Connection conn = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","");

            CallableStatement callableStatement = conn.prepareCall("{call empprocedure(301, 'Emp301')}");
            callableStatement.execute();

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
