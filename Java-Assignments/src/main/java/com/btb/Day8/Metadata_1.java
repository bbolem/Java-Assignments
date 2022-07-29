package com.btb.Day8;
import java.sql.*;
public class Metadata_1 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet resultSet = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","Jhps_232");

            DatabaseMetaData dbMD = conn.getMetaData();
            System.out.println(dbMD.getDatabaseProductName());
            System.out.println(dbMD.getDatabaseProductVersion());
            System.out.println(dbMD.getDriverName());
            System.out.println(dbMD.getCatalogs());
            System.out.println(dbMD.getIdentifierQuoteString());

            stmt = conn.createStatement();
            resultSet = stmt.executeQuery("select * from student");

            ResultSetMetaData rsMD = resultSet.getMetaData();
            System.out.println(rsMD.getColumnCount());
            while (resultSet.next()){
                System.out.println(rsMD.getColumnName(1) + " " + rsMD.getColumnTypeName(1));
                System.out.println(rsMD.getColumnName(2) + " " + rsMD.getColumnTypeName(2));
            }

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
