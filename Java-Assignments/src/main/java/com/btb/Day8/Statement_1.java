package com.btb.Day8;
import java.sql.*;
public class Statement_1 {
    public static void main(String[] args) {

        Connection conn = null;
        ResultSet resultSet = null;
        Statement stmt = null;

        try {
            Driver driver = new com.mysql.cj.jdbc.Driver();
            DriverManager.registerDriver(driver);

            //This is not mandatory
            //Class.forName("com.mysql.cj.jdbc.Driver");

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","Jhps_232");

            stmt = conn.createStatement();

            int count = stmt.executeUpdate("insert into student values (3,'Stu33')");
            System.out.println("Inserting..." + count);

            resultSet = stmt.executeQuery("select * from student");
            while (resultSet.next()){
                System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2));
            }

            count = stmt.executeUpdate("update student set name = 'Stu3' where id =3");
            System.out.println("Updating..." + count);

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
