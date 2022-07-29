package com.btb.Day8;
import java.sql.*;
public class PreparedStmt_1 {
    public static void main(String[] args) {

        Connection con = null;
        PreparedStatement pstmt = null;
        ResultSet rs;

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","Jhps_232");


            pstmt = con.prepareStatement("insert into student values (?,?)");
            pstmt.setInt(1,4);
            pstmt.setString(2,"Stu44");
            pstmt.executeUpdate();
            System.out.println("Inserting...");

            pstmt = con.prepareStatement("select * from student");
            rs = pstmt.executeQuery();

            while (rs.next()){
                System.out.println(rs.getInt("id") + " " + rs.getString("name"));
            }

            pstmt = con.prepareStatement("update student set name = 'Stu4' where id=4");
            pstmt.executeUpdate();
            System.out.println("Updating...");

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (con != null){
                    con.close();
                }
            } catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
}
