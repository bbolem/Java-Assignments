package com.btb.Day9;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.sql.*;

public class Serialization_6 {
    public static void main(String[] args) {
        Connection conn = null;

        Statement stmt = null;
        ResultSet resultSet = null;

        try {
            Driver driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);

            //This is not mandatory
            //Class.forName("com.mysql.cj.jdbc.Driver");

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");

            stmt = conn.createStatement();

            int count = stmt.executeUpdate("insert into test.cars values (29250,'Honda', 'Accord', 2017)");
            System.out.println("Inserting..." + count);

            resultSet = stmt.executeQuery("select * from test.cars");
            while (resultSet.next()){
                System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " "
                        + resultSet.getString(3) + " " + resultSet.getInt(4));
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

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
class Car implements Serializable {
    private static final long serialVerUID = 5213L;
    private String make;
    private String model;
    private int year;
    private transient String vinNum;
}
