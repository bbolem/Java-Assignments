package com.btb.Day8;
import java.sql.*;
public class BatchProcessing_1 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","Jhps_232");

            stmt = conn.createStatement();
            stmt.addBatch("insert into training.student values(6,'Stu6')");
            stmt.executeBatch();

            preparedStatement = conn.prepareCall("insert into training.student values(7,'Stu7')");
            preparedStatement.addBatch();
            preparedStatement.executeBatch();

            preparedStatement = conn.prepareStatement("select * from student");
            rs = preparedStatement.executeQuery();
            while (rs.next()){
                System.out.println(rs.getInt("id") + " " + rs.getString("name"));
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
