package com.jdbc;

import java.util.Scanner;
import java.sql.*;

public class InsertDatabase {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int rollNo =-1;
        String StudentName;

        while(rollNo!=0) {
            System.out.println("______To Exit enter Zero for rollNo_______");
            System.out.println("Enter the roll the number ");
            rollNo = in.nextInt();
            System.out.println("Enter the roll the name ");
            StudentName = in.next();

            String url = "jdbc:mysql://localhost/student";
            String DatabaseName = "root";
            String pass = "susanoo@93fire";
            String query = "insert into info values(?,?);";

            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con = DriverManager.getConnection(url, DatabaseName, pass);
                PreparedStatement st = con.prepareStatement(query);
                st.setInt(1, rollNo);
                st.setString(2, StudentName);
                int rowsEffected = st.executeUpdate();

                System.out.println("rows/colums effected is " + rowsEffected);

                st.close();
                con.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
    }
}
