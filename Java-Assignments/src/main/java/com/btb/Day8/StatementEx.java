package com.btb.Day8;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class StatementEx {
    public static void main(String[] args) {

        Connection conn = null;

        try {
            //Driver driver = new Driver();
            //DriverManager.registerDriver(driver);

            //This is not mandatory
            //Class.forName("com.mysql.cj.jdbc.Driver");

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","Jhps_232");

            Statement stmt = conn.createStatement();

//            int count = stmt.executeUpdate("insert into employee values (" + args[0] + ", '" + args[1] + "')");
//            System.out.println(count);

//            int count = stmt.executeUpdate("update employee set name = 'emp44' where id =4");
//            System.out.println(count);

            DatabaseMetaData dbData = conn.getMetaData();


            ResultSet resultSet = stmt.executeQuery("select * from student");
            while (resultSet.next()){
                System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2));
            }

            //Access Data about table
//            ResultSetMetaData resultSetMetaData = resultSet.getMetaData();
//            System.out.println(resultSetMetaData.getColumnCount());
//            System.out.println(resultSetMetaData.getColumnName(1));
//            System.out.println(resultSetMetaData.getColumnType(1));

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
